(ns reagent-mui.icons.join-right
  "Imports @mui/icons-material/JoinRight as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def join-right (create-svg-icon [(e "ellipse" #js {"cx" "12", "cy" "12", "rx" "3", "ry" "5.74"}) (e "path" #js {"d" "M16.5 12c0 .97-.23 4.16-3.03 6.5.78.31 1.63.5 2.53.5 3.86 0 7-3.14 7-7s-3.14-7-7-7c-.9 0-1.75.19-2.53.5 2.8 2.34 3.03 5.53 3.03 6.5zM8 19c.9 0 1.75-.19 2.53-.5-.61-.51-1.1-1.07-1.49-1.63-.33.08-.68.13-1.04.13-2.76 0-5-2.24-5-5s2.24-5 5-5c.36 0 .71.05 1.04.13.39-.56.88-1.12 1.49-1.63C9.75 5.19 8.9 5 8 5c-3.86 0-7 3.14-7 7s3.14 7 7 7z"})]
                                 "JoinRight"))
