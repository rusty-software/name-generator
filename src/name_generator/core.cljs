(ns name-generator.core
  (:require [reagent.core :as reagent]
            [name-generator.transformers :as transformers]))

(enable-console-print!)

(defonce app-state (reagent/atom {}))

(defn generate-name []
  (let [name (str (rand-nth transformers/prefixes) (rand-nth transformers/suffixes))]
    (if (transformers/canonical-names name)
      (generate-name)
      name)))

(defn generate-names []
  (let [names (loop [acc []]
                (if (= 10 (count acc))
                  acc
                  (recur (conj acc (generate-name)))))]
    (swap! app-state assoc :names names)))

(defn main-view []
  [:div
   [:h1
    "Generate names!"]
   [:div
    [:button
     {:on-click #(generate-names)}
     "Generate!"]]
   [:div
    (for [name (:names @app-state)]
      ^{:key name}
      [:div name])]])

(reagent/render-component [main-view]
                          (. js/document (getElementById "app")))


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
