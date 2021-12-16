(ns reagent-mui.icons.display-settings-sharp
  "Imports @mui/icons-material/DisplaySettingsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def display-settings-sharp (create-svg-icon [(e "path" #js {"d" "M22 3H2v16h6v2h8v-2h6V3zm-2 14H4V5h16v12z"}) (e "path" #js {"d" "M6 8.25h8v1.5H6zm10.5 1.5H18v-1.5h-1.5V7H15v4h1.5zm-6.5 2.5h8v1.5h-8zM7.5 15H9v-4H7.5v1.25H6v1.5h1.5z"})]
                                             "DisplaySettingsSharp"))
