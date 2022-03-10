(ns reagent-mui.icons.signal-cellular-alt-1-bar-two-tone
  "Imports @mui/icons-material/SignalCellularAlt1BarTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-alt-1-bar-two-tone (create-svg-icon (e "path" #js {"d" "M5 14h3v6H5v-6z"})
                                                         "SignalCellularAlt1BarTwoTone"))
