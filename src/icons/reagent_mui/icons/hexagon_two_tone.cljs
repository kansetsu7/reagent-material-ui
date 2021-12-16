(ns reagent-mui.icons.hexagon-two-tone
  "Imports @mui/icons-material/HexagonTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def hexagon-two-tone (create-svg-icon [(e "path" #js {"d" "M16.05 19h-8.1l-4.04-7 4.04-7h8.1l4.04 7z", "opacity" ".3"}) (e "path" #js {"d" "M17.2 3H6.8l-5.2 9 5.2 9h10.4l5.2-9-5.2-9zm-1.15 16h-8.1l-4.04-7 4.04-7h8.09l4.04 7-4.03 7z"})]
                                       "HexagonTwoTone"))
