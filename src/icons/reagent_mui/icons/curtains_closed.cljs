(ns reagent-mui.icons.curtains-closed
  "Imports @mui/icons-material/CurtainsClosed as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def curtains-closed (create-svg-icon (e "path" #js {"d" "M20 19V3H4v16H2v2h20v-2h-2zM11 5h2v14h-2V5z"})
                                      "CurtainsClosed"))
