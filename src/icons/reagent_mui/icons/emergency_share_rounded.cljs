(ns reagent-mui.icons.emergency-share-rounded
  "Imports @mui/icons-material/EmergencyShareRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def emergency-share-rounded (create-svg-icon (e "path" #js {"d" "M12 9c-3.15 0-6 2.41-6 6.15 0 2.35 1.78 5.11 5.34 8.27.37.33.95.33 1.33 0C16.22 20.25 18 17.5 18 15.15 18 11.41 15.15 9 12 9zm0 7.5c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5zm4.18-9.68c-.35.35-.89.38-1.3.09C14.07 6.34 13.07 6 12 6s-2.07.34-2.88.91c-.41.28-.95.26-1.3-.09-.43-.43-.39-1.15.09-1.5C9.06 4.49 10.48 4 12 4s2.94.49 4.09 1.32c.49.35.52 1.07.09 1.5zM4.97 3.97c-.42-.43-.38-1.12.08-1.5C6.95.93 9.37 0 12.01 0c2.64 0 5.06.93 6.95 2.48.46.38.5 1.07.08 1.49-.36.36-.93.39-1.32.07C16.16 2.77 14.17 2 12.01 2c-2.18 0-4.17.77-5.72 2.04-.39.32-.96.28-1.32-.07z"})
                                              "EmergencyShareRounded"))
