(ns reagent-mui.icons.bar-chart-sharp
  "Imports @mui/icons-material/BarChartSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bar-chart-sharp (create-svg-icon (e "path" #js {"d" "M5 9.2h3V19H5V9.2zM10.6 5h2.8v14h-2.8V5zm5.6 8H19v6h-2.8v-6z"})
                                      "BarChartSharp"))
