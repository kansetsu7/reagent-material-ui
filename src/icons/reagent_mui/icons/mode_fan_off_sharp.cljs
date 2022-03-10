(ns reagent-mui.icons.mode-fan-off-sharp
  "Imports @mui/icons-material/ModeFanOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mode-fan-off-sharp (create-svg-icon (e "path" #js {"d" "m16.34 8.36-2.29.82c-.18-.13-.38-.25-.58-.34.17-.83.63-1.58 1.36-2.06C16.85 5.44 16.18 2 13.39 2c-3.08 0-4.9 1.47-5.3 3.26L18.73 15.9c1.5.39 3.27-.51 3.27-2.51 0-4.39-3.01-6.23-5.66-5.03zM2.81 2.81 1.39 4.22 5.27 8.1C3.77 7.7 2 8.61 2 10.61c0 4.4 3.01 6.24 5.66 5.03l2.29-.82c.18.13.38.25.58.34-.17.83-.63 1.58-1.36 2.06C7.15 18.56 7.82 22 10.61 22c3.08 0 4.9-1.47 5.3-3.26l3.87 3.87 1.41-1.41L2.81 2.81z"})
                                         "ModeFanOffSharp"))
