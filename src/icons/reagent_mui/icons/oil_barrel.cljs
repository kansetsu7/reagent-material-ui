(ns reagent-mui.icons.oil-barrel
  "Imports @mui/icons-material/OilBarrel as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def oil-barrel (create-svg-icon (e "path" #js {"d" "M20 13c.55 0 1-.45 1-1s-.45-1-1-1h-1V5h1c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1h1v6H4c-.55 0-1 .45-1 1s.45 1 1 1h1v6H4c-.55 0-1 .45-1 1s.45 1 1 1h16c.55 0 1-.45 1-1s-.45-1-1-1h-1v-6h1zm-8 3c-1.66 0-3-1.32-3-2.95 0-1.3.52-1.67 3-4.55 2.47 2.86 3 3.24 3 4.55 0 1.63-1.34 2.95-3 2.95z"})
                                 "OilBarrel"))
