(ns reagent-mui.icons.domain-add-outlined
  "Imports @mui/icons-material/DomainAddOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def domain-add-outlined (create-svg-icon (e "path" #js {"d" "M12 7V3H2v18h14v-2h-4v-2h2v-2h-2v-2h2v-2h-2V9h8v6h2V7H12zM6 19H4v-2h2v2zm0-4H4v-2h2v2zm0-4H4V9h2v2zm0-4H4V5h2v2zm4 12H8v-2h2v2zm0-4H8v-2h2v2zm0-4H8V9h2v2zm0-4H8V5h2v2zm14 12v2h-2v2h-2v-2h-2v-2h2v-2h2v2h2zm-6-8h-2v2h2v-2zm0 4h-2v2h2v-2z"})
                                          "DomainAddOutlined"))
