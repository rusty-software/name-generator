(ns name-generator.transformers)

(def canonical-names #{"Abominus"
                       "Acid Storm"
                       "Aimless"
                       "Air Warrior"
                       "Airachnid"
                       "Airwave"
                       "Alice"
                       "Ambulon"
                       "Apeface"
                       "Aquablast"
                       "Armorhide"
                       "Astrotrain"
                       "Axer"
                       "Bacchus"
                       "Backfire"
                       "Banzai-Tron"
                       "Barrage"
                       "Barricade"
                       "Battletrap"
                       "Beastbox"
                       "Birdbrain"
                       "Bitstream"
                       "Black Shadow"
                       "Blackarachnia"
                       "Blackjack"
                       "Blackout"
                       "Blackwall"
                       "Blast Off"
                       "Blight"
                       "Blip"
                       "Blitzwing"
                       "Blowpipe"
                       "Bomb-Burst"
                       "Bombshell"
                       "Bombshock"
                       "Bonecrusher"
                       "Boom"
                       "Brains"
                       "Brawl"
                       "Breakdown"
                       "Brisko"
                       "Bristleback"
                       "Brunt"
                       "Bruticus"
                       "Bug Bite"
                       "Bugly"
                       "Bulletbike"
                       "Buzzsaw"
                       "Caliburst"
                       "Carnivac"
                       "Catgut"
                       "Catilla"
                       "Cement-Head"
                       "Chop Shop"
                       "Cindersaur"
                       "Clench"
                       "Clipshade"
                       "Clone #2716057"
                       "Clone #3370318"
                       "Crankcase"
                       "Crosscut"
                       "Cyclonus"
                       "Darklight"
                       "Darkwing"
                       "Dead End"
                       "Deathsaurus"
                       "Deluge"
                       "Demolishor"
                       "Den-O"
                       "Detour"
                       "Devastator"
                       "Dinoking"
                       "Direct-Hit"
                       "Dirge"
                       "Dirt Boss"
                       "Dirtbag"
                       "Divebomb"
                       "Doryu"
                       "Double Punch"
                       "Doubledealer"
                       "Drag Strip"
                       "Dreadwind"
                       "Dreadwing"
                       "Drench"
                       "Drift"
                       "Drillhorn"
                       "Dropkick"
                       "Dropshot"
                       "Excavator"
                       "Falcon"
                       "Fangry"
                       "Fearstorm"
                       "Fearswoop"
                       "Finback"
                       "Fireball"
                       "Fireshot"
                       "Flamefeather"
                       "Flamewar"
                       "Flatline"
                       "Flattop"
                       "Flywheels"
                       "Fracas"
                       "Fracture"
                       "Frenzy"
                       "Fulcrum"
                       "Full-Tilt"
                       "Gailhawk"
                       "Gairyu"
                       "Galvatron"
                       "Gatoraider"
                       "Gigatron"
                       "Goryu"
                       "Greasepit"
                       "Grindor"
                       "Grit"
                       "Groundhog"
                       "Growl"
                       "Gutcruncher"
                       "Hairsplitter"
                       "Half-Track"
                       "Hammer"
                       "Hardtop"
                       "Hawk"
                       "Hawkbreast"
                       "Headstrong"
                       "Heater"
                       "Heatwave"
                       "Heavy Barrel"
                       "Heavy Load"
                       "Helex"
                       "Hellbat"
                       "Hightower"
                       "Hook"
                       "Hooligan"
                       "Horri-Bull"
                       "Hotlink"
                       "Hun-Gurrr"
                       "Hydradread"
                       "Hyperdrive"
                       "Icepick"
                       "Iguanus"
                       "Inceinerator"
                       "Inferno"
                       "Ion Storm"
                       "Jarugar"
                       "Jetstorm"
                       "Jhiaxus"
                       "Jolt"
                       "Kakuryu"
                       "Kaon"
                       "Kickback"
                       "Killbison"
                       "Knockout"
                       "Knok"
                       "Knucklehead"
                       "Kreb"
                       "Kro"
                       "Krok"
                       "Krunk"
                       "Landquake"
                       "Lazerbeak"
                       "Leader-1"
                       "Leozack"
                       "Leokaiser"
                       "Lionbreast"
                       "Lockdown"
                       "Lokos"
                       "Long Haul"
                       "Lugnut"
                       "Lyzack"
                       "Magnificus"
                       "Mega-Octane"
                       "Megadeath"
                       "Megatron"
                       "Meltdown"
                       "Menasor"
                       "Metrotitan"
                       "Mindwipe"
                       "Mini-spy"
                       "Mirage"
                       "Misfire"
                       "Mixmaster"
                       "Monstructor"
                       "Monzo"
                       "Motormaster"
                       "Movor"
                       "Nacelle"
                       "Nautilator"
                       "Needlenose"
                       "Nemesis Prime"
                       "Nightbird"
                       "Nightflight"
                       "Nightracer"
                       "Nightstick"
                       "Nova Storm"
                       "Obsidian"
                       "Octane"
                       "Octopunch"
                       "Oil Slick"
                       "Onslaught"
                       "Overbite"
                       "Overcast"
                       "Overhead"
                       "Overkill"
                       "Overload"
                       "Payload"
                       "Piranacon"
                       "Pounce"
                       "Power Punch"
                       "Powerdrive"
                       "Predaking"
                       "Punch"
                       "Quake"
                       "Rack'n'Ruin"
                       "Rage"
                       "Rail Racer"
                       "Rairyu"
                       "Ramjet"
                       "Rampage"
                       "Ransack"
                       "Ratbat"
                       "Ravage"
                       "Razor-Sharp"
                       "Razorclaw"
                       "Red Wing"
                       "Reflector"
                       "Reverb"
                       "Rippersnapper"
                       "Ripsnorter"
                       "Ro-Tor"
                       "Road Hugger"
                       "Roadblock"
                       "Roadgrabber"
                       "Roller Force"
                       "Rook"
                       "Roughstuff"
                       "Ruckus"
                       "Ruination"
                       "Rumble"
                       "Runabout"
                       "Runamuck"
                       "Scalpel"
                       "Scavenger"
                       "Scorponok"
                       "Scourge"
                       "Scowl"
                       "Scrapmetal"
                       "Scrapper"
                       "Seawing"
                       "Shadow Stalker"
                       "Shockwave"
                       "Shrapnel"
                       "Sideways"
                       "Singe"
                       "Sixshot"
                       "Skalor"
                       "Skar"
                       "Skullcruncher"
                       "Skullgrin"
                       "Skyhopper"
                       "Skystalker"
                       "Skywarp"
                       "Sledge"
                       "Slinger"
                       "Slipstream"
                       "Slog"
                       "Slugfest"
                       "Slugslinger"
                       "Snapdragon"
                       "Snaptrap"
                       "Snare"
                       "Snarler"
                       "Snipe"
                       "Solon Kitakaze"
                       "Sonic"
                       "Soundwave"
                       "Space Case"
                       "Spaceshot"
                       "Sparkstalker"
                       "Spasma"
                       "Spectro"
                       "Spinhead"
                       "Spinister"
                       "Spyglass"
                       "Squawkbox"
                       "Squawktalk"
                       "Squeezeplay"
                       "Starscream"
                       "Steamhammer"
                       "Stockade"
                       "Stonecruncher"
                       "Stormcloud"
                       "Stranglehold"
                       "Straxus"
                       "Strika"
                       "Submarauder"
                       "Sunbeam"
                       "Sunstorm"
                       "Swindle"
                       "Switchblade"
                       "Tailwind"
                       "Tankor"
                       "Tantrum"
                       "Tarn"
                       "Tentakil"
                       "Terradive"
                       "Terror-Tread"
                       "Tesarus"
                       "The Fallen"
                       "Thinkbox"
                       "Throttle"
                       "Thrust"
                       "Thundercracker"
                       "Thunderwing"
                       "Tidal Wave"
                       "Tigerhawk"
                       "Tiptop"
                       "Topspin"
                       "Tornado"
                       "Tracer"
                       "Transit"
                       "Treadshot"
                       "Triggerhappy"
                       "Trypticon"
                       "Turmoil"
                       "Twinstrike"
                       "Vanquish"
                       "Venom"
                       "Viewfinder"
                       "Volt"
                       "Vorath"
                       "Vortex"
                       "Vos"
                       "Waspinator"
                       "Weirdwolf"
                       "Wheelie"
                       "Whisper"
                       "Wildfly"
                       "Wildrider"
                       "Windcharger"
                       "Windrazor"
                       "Windsweeper"
                       "Wingspan"
                       "Wipeout"
                       "Wreckage"
                       "Yokuryu"
                       "Zigzag"})

(def prefixes ["Acid"
               "Aero"
               "After"
               "Air"
               "Aqua"
               "Armor"
               "Astro"
               "Auto"
               "Avian"
               "Back"
               "Black"
               "Blast"
               "Blow"
               "Blue"
               "Body"
               "Bomb"
               "Bone"
               "Boulder"
               "Brake"
               "Break"
               "Broad"
               "Brush"
               "Brute"
               "Bulk"
               "Bull"
               "Bullet"
               "Buzz"
               "Cannon"
               "Chain"
               "Chrome"
               "Cinder"
               "Cliff"
               "Cloud"
               "Crack"
               "Crank"
               "Cross"
               "Dark"
               "Dead"
               "Death"
               "Deep"
               "Deft"
               "Depth"
               "Dirt"
               "Dive"
               "Doom"
               "Double"
               "Drag"
               "Dread"
               "Drop"
               "Dune"
               "Dust"
               "Fang"
               "Fear"
               "Fiery"
               "Fire"
               "Fist"
               "Flame"
               "Flash"
               "Flat"
               "Flight"
               "Fly"
               "Free"
               "Freeze"
               "Frost"
               "Gear"
               "Gloom"
               "Gold"
               "Grand"
               "Grim"
               "Grind"
               "Grizz"
               "Groove"
               "Ground"
               "Growl"
               "Gun"
               "Hail"
               "Half"
               "Hammer"
               "Hang"
               "Hard"
               "Head"
               "Heat"
               "Heavy"
               "Heli"
               "High"
               "Hook"
               "Hot"
               "Hydra"
               "Hydrau"
               "Hyper"
               "Ice"
               "Ion"
               "Iron"
               "Jaw"
               "Jet"
               "Jolt"
               "Junk"
               "Kick"
               "Kill"
               "Land"
               "Lazer"
               "Lead"
               "Leo"
               "Light"
               "Lock"
               "Long"
               "Lunar"
               "Magma"
               "Magna"
               "Mean"
               "Mecha"
               "Mega"
               "Melt"
               "Mind"
               "Motor"
               "Neutro"
               "Night"
               "Nova"
               "Oil"
               "Over"
               "Phase"
               "Photon"
               "Power"
               "Pyro"
               "Quick"
               "Rage"
               "Rail"
               "Ram"
               "Rapid"
               "Rat"
               "Razor"
               "Red"
               "Retro"
               "Rhi"
               "Rhino"
               "Rip"
               "Road"
               "Roll"
               "Rotor"
               "Rough"
               "Ruin"
               "Rumble"
               "Savage"
               "Scorch"
               "Scrap"
               "Sea"
               "Shade"
               "Shadow"
               "Shock"
               "Side"
               "Silver"
               "Skull"
               "Sky"
               "Slam"
               "Slip"
               "Smoke"
               "Snap"
               "Solar"
               "Sound"
               "Space"
               "Spark"
               "Speed"
               "Spin"
               "Star"
               "Steam"
               "Steel"
               "Stone"
               "Storm"
               "Strangle"
               "Strike"
               "Sun"
               "Swift"
               "Switch"
               "Thunder"
               "Tiga"
               "Tiger"
               "Top"
               "Tread"
               "Trigger"
               "Turbo"
               "Twin"
               "Vice"
               "Volt"
               "Wide"
               "Wild"
               "Wind"
               "Wing"
               "Wolf"
               "Wreck"])

(def suffixes ["back"
               "bang"
               "beam"
               "beast"
               "bird"
               "bite"
               "blade"
               "blades"
               "blast"
               "blaze"
               "blight"
               "blitz"
               "bolt"
               "bomb"
               "boom"
               "bot"
               "brawl"
               "brawn"
               "burn"
               "burner"
               "burst"
               "buster"
               "button"
               "case"
               "cast"
               "charge"
               "charger"
               "circuit"
               "clash"
               "claw"
               "cloud"
               "clutch"
               "crack"
               "crunch"
               "crush"
               "crusher"
               "cut"
               "cycle"
               "dash"
               "dealer"
               "dive"
               "dome"
               "down"
               "drift"
               "drive"
               "face"
               "feather"
               "fight"
               "fire"
               "fist"
               "flash"
               "flight"
               "flow"
               "foot"
               "frame"
               "glide"
               "glider"
               "glitch"
               "guard"
               "hammer"
               "head"
               "heap"
               "hide"
               "horn"
               "jaw"
               "jump"
               "kick"
               "kill"
               "lane"
               "lift"
               "light"
               "line"
               "load"
               "lock"
               "master"
               "mine"
               "out"
               "point"
               "pounder"
               "punch"
               "quake"
               "raid"
               "raider"
               "rake"
               "raker"
               "ray"
               "razor"
               "ride"
               "rider"
               "runner"
               "scope"
               "scrap"
               "scraps"
               "scream"
               "shell"
               "shift"
               "shock"
               "shot"
               "side"
               "sight"
               "siren"
               "slide"
               "sling"
               "slinger"
               "snarl"
               "spike"
               "spin"
               "splitter"
               "spot"
               "stalker"
               "steel"
               "stop"
               "storm"
               "strap"
               "streak"
               "stream"
               "strike"
               "strong"
               "stuff"
               "sweep"
               "switch"
               "thing"
               "top"
               "track"
               "tracks"
               "trap"
               "tron"
               "twitch"
               "viper"
               "vortex"
               "war"
               "watch"
               "wave"
               "way"
               "ways"
               "wheels"
               "whip"
               "wind"
               "wing"
               "wire"
               "wise"
               "works"])
