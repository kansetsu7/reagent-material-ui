(ns reagent-mui.icons.turn-slight-right-rounded
  "Imports @mui/icons-material/TurnSlightRightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-slight-right-rounded (create-svg-icon (e "path" #js {"d" "M12.34 5c0-.55.45-1 1-1H17c.55 0 1 .45 1 1v3.66c0 .55-.45 1-1 1s-1-.45-1-1V7.41l-5 5V19c0 .55-.45 1-1 1s-1-.45-1-1v-6.58c0-.53.21-1.04.59-1.41l5-5h-1.24C12.79 6 12.34 5.55 12.34 5z"})
                                                "TurnSlightRightRounded"))
