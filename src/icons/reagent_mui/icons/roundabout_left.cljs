(ns reagent-mui.icons.roundabout-left
  "Imports @mui/icons-material/RoundaboutLeft as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def roundabout-left (create-svg-icon (e "path" #js {"d" "M10.08 8c.48-2.84 2.94-5 5.92-5 3.31 0 6 2.69 6 6 0 2.97-2.16 5.44-5 5.92V21h-2v-6.09c0-.98.71-1.8 1.67-1.97C18.56 12.63 20 10.98 20 9c0-2.21-1.79-4-4-4-1.98 0-3.63 1.44-3.94 3.33-.17.96-.99 1.67-1.97 1.67H5.83l1.59 1.59L6 13 2 9l4-4 1.41 1.41L5.83 8h4.25z"})
                                      "RoundaboutLeft"))
