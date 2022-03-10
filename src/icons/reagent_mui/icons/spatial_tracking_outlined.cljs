(ns reagent-mui.icons.spatial-tracking-outlined
  "Imports @mui/icons-material/SpatialTrackingOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def spatial-tracking-outlined (create-svg-icon [(e "path" #js {"d" "M10 13c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4zm0-6c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm6.39 8.56C14.71 14.7 12.53 14 10 14s-4.71.7-6.39 1.56C2.61 16.07 2 17.1 2 18.22V21h16v-2.78c0-1.12-.61-2.15-1.61-2.66zM16 19H4v-.78c0-.38.2-.72.52-.88C5.71 16.73 7.63 16 10 16c2.37 0 4.29.73 5.48 1.34.32.16.52.5.52.88V19zm4.05-16.59L18.64 1c-3.51 3.51-3.51 9.21 0 12.73l1.41-1.41c-2.73-2.74-2.73-7.18 0-9.91z"}) (e "path" #js {"d" "m22.88 5.24-1.41-1.41c-1.95 1.95-1.95 5.12 0 7.07l1.41-1.41c-1.17-1.17-1.17-3.08 0-4.25z"})]
                                                "SpatialTrackingOutlined"))
