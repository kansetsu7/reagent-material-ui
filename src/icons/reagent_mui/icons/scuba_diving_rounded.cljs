(ns reagent-mui.icons.scuba-diving-rounded
  "Imports @mui/icons-material/ScubaDivingRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def scuba-diving-rounded (create-svg-icon (e "path" #js {"d" "M1 13c0-1.1.9-2 2-2s2 .9 2 2-.9 2-2 2-2-.9-2-2zm7.89-2.89 3.56-.95c.53-.14.85-.69.71-1.22l-.26-.97c-.14-.53-.69-.85-1.22-.71l-3.57.95c-.8.21-1.28 1.04-1.06 1.84.22.8 1.04 1.28 1.84 1.06zm13.63-7.59c-.29-.29-.75-.29-1.04 0L19 5l-2 4-9.48 2.87c-.82.2-1.39.89-1.5 1.68L5.24 18 3 21c-.33.44-.24 1.07.2 1.4.44.33 1.07.24 1.4-.2L7 19l1.14-3.14 5.57-1.77c.19-.06.38-.15.54-.27l4.2-2.94c.36-.25.62-.61.75-1.02l1.3-3.96 2.06-2.38c.25-.3.23-.73-.04-1z"})
                                           "ScubaDivingRounded"))
