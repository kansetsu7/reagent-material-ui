(ns reagent-mui.icons.data-array-outlined
  "Imports @mui/icons-material/DataArrayOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def data-array-outlined (create-svg-icon (e "path" #js {"d" "M15 4v2h3v12h-3v2h5V4zM4 20h5v-2H6V6h3V4H4z"})
                                          "DataArrayOutlined"))
