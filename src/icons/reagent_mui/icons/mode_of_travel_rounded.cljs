(ns reagent-mui.icons.mode-of-travel-rounded
  "Imports @mui/icons-material/ModeOfTravelRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mode-of-travel-rounded (create-svg-icon (e "path" #js {"d" "M4 10.2C4 5.22 7.8 2 12 2c4 0 7.64 2.92 7.97 7.5h2.32c.45 0 .67.54.35.85l-3.29 3.29c-.2.2-.51.2-.71 0l-3.29-3.29c-.31-.31-.09-.85.35-.85h2.26C17.65 6.24 15.13 4 12 4c-3.35 0-6 2.57-6 6.2 0 2.34 1.95 5.44 6 9.14.64-.59 1.23-1.16 1.77-1.71-.17-.34-.27-.72-.27-1.12 0-1.38 1.12-2.5 2.5-2.5s2.5 1.12 2.5 2.5S17.38 19 16 19c-.24 0-.47-.03-.69-.1-.78.82-1.67 1.66-2.65 2.52-.38.33-.95.33-1.33 0C6.45 17.12 4 13.38 4 10.2z"})
                                             "ModeOfTravelRounded"))
