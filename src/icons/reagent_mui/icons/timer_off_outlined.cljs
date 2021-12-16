(ns reagent-mui.icons.timer-off-outlined
  "Imports @mui/icons-material/TimerOffOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def timer-off-outlined (create-svg-icon [(e "path" #js {"d" "M9 1h6v2H9zm3 5c3.87 0 7 3.13 7 7 0 .94-.19 1.83-.52 2.65l1.5 1.5C20.63 15.91 21 14.5 21 13c0-2.12-.74-4.07-1.97-5.61l1.42-1.42c-.43-.51-.9-.99-1.41-1.41l-1.42 1.42C16.07 4.74 14.12 4 12 4c-1.5 0-2.91.37-4.15 1.02l1.5 1.5C10.17 6.19 11.06 6 12 6z"}) (e "path" #js {"d" "m11 8.17 2 2V8h-2zM2.81 2.81 1.39 4.22l3.4 3.4C3.67 9.12 3 10.98 3 13c0 4.97 4.02 9 9 9 2.02 0 3.88-.67 5.38-1.79l2.4 2.4 1.41-1.41L2.81 2.81zM12 20c-3.87 0-7-3.13-7-7 0-1.47.45-2.83 1.22-3.95l9.73 9.73C14.83 19.55 13.47 20 12 20z"})]
                                         "TimerOffOutlined"))
