(ns reagent-mui.icons.safety-check-rounded
  "Imports @mui/icons-material/SafetyCheckRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def safety-check-rounded (create-svg-icon (e "path" #js {"d" "m11.3 2.26-6 2.25C4.52 4.81 4 5.55 4 6.39v4.7c0 4.83 3.13 9.37 7.43 10.75.37.12.77.12 1.14 0 4.3-1.38 7.43-5.91 7.43-10.75v-4.7c0-.83-.52-1.58-1.3-1.87l-6-2.25c-.45-.18-.95-.18-1.4-.01zM12 17c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5zm2-3c-.2.2-.51.2-.71 0l-1.65-1.65c-.09-.09-.15-.22-.15-.35V9.5c.01-.28.23-.5.51-.5s.5.22.5.5v2.29l1.5 1.5c.2.2.2.51 0 .71z"})
                                           "SafetyCheckRounded"))
