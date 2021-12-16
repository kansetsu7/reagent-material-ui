(ns reagent-mui.icons.sports-martial-arts-two-tone
  "Imports @mui/icons-material/SportsMartialArtsTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sports-martial-arts-two-tone (create-svg-icon [(e "path" #js {"d" "m19.8 2-8.2 6.7-1.21-1.04 3.6-2.08L9.41 1 8 2.41l2.74 2.74L5 8.46l-1.19 4.29L6.27 17 8 16l-2.03-3.52.35-1.3L9.5 13l.5 9h2l.5-10L21 3.4z"}) (e "circle" #js {"cx" "5", "cy" "5", "r" "2"})]
                                                   "SportsMartialArtsTwoTone"))
