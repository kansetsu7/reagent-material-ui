(ns reagent-mui.icons.satellite-alt-sharp
  "Imports @mui/icons-material/SatelliteAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def satellite-alt-sharp (create-svg-icon (e "path" #js {"d" "m15.44.59-3.18 3.18c-.78.78-.78 2.05 0 2.83l1.24 1.24-.71.71-2.65-2.65-4.24 4.24 2.65 2.65-.71.71-1.24-1.25c-.78-.78-2.05-.78-2.83 0L.59 15.43c-.78.78-.78 2.05 0 2.83l3.54 3.54c.78.78 2.05.78 2.83 0l3.18-3.18c.78-.78.78-2.05 0-2.83L8.9 14.55l.71-.71 2.65 2.65 4.24-4.24-2.66-2.65.71-.71 1.24 1.24c.78.78 2.05.78 2.83 0l3.18-3.18c.78-.78.78-2.05 0-2.83L18.26.58c-.78-.78-2.04-.78-2.82.01zM6.6 19.32l-1.06 1.06L2 16.85l1.06-1.06 3.54 3.53zm2.12-2.12-1.06 1.06-3.54-3.54 1.06-1.06 3.54 3.54zm9.54-9.54L17.2 8.72l-3.54-3.54 1.06-1.06 3.54 3.54zm2.12-2.12L19.32 6.6l-3.54-3.54L16.85 2l3.53 3.54zM21 14h2c0 4.97-4.03 9-9 9v-2c3.87 0 7-3.13 7-7zm-4 0h2c0 2.76-2.24 5-5 5v-2c1.66 0 3-1.34 3-3z"})
                                          "SatelliteAltSharp"))
