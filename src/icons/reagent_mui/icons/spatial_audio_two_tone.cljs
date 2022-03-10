(ns reagent-mui.icons.spatial-audio-two-tone
  "Imports @mui/icons-material/SpatialAudioTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def spatial-audio-two-tone (create-svg-icon [(e "path" #js {"d" "M15.48 17.34C14.29 16.73 12.37 16 10 16c-2.37 0-4.29.73-5.48 1.34-.32.16-.52.5-.52.88V19h12v-.78c0-.38-.2-.72-.52-.88z", "opacity" ".3"}) (e "circle" #js {"cx" "10", "cy" "9", "r" "2", "opacity" ".3"}) (e "path" #js {"d" "M10 13c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4zm0-6c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm6.39 8.56C14.71 14.7 12.53 14 10 14s-4.71.7-6.39 1.56C2.61 16.07 2 17.1 2 18.22V21h16v-2.78c0-1.12-.61-2.15-1.61-2.66zM16 19H4v-.78c0-.38.2-.72.52-.88C5.71 16.73 7.63 16 10 16c2.37 0 4.29.73 5.48 1.34.32.16.52.5.52.88V19zm0-18h-2c0 4.97 4.03 9 9 9V8c-3.86 0-7-3.14-7-7z"}) (e "path" #js {"d" "M20 1h-2c0 2.76 2.24 5 5 5V4c-1.65 0-3-1.35-3-3z"})]
                                             "SpatialAudioTwoTone"))
