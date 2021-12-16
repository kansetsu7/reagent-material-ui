(ns reagent-mui.icons.swipe-up-rounded
  "Imports @mui/icons-material/SwipeUpRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swipe-up-rounded (create-svg-icon (e "path" #js {"d" "M8.83 19.1c-.26-.6.09-1.28.73-1.41l3.58-.71-4.35-9.81c-.34-.76 0-1.64.76-1.98.76-.34 1.64 0 1.98.76l2.43 5.49.84-.37c.28-.13.59-.18.9-.17l4.56.21c.86.04 1.6.63 1.83 1.45l1.23 4.33c.27.96-.2 1.97-1.11 2.37l-5.63 2.49c-.48.21-1.26.33-1.76.14l-5.45-2.27c-.24-.09-.44-.28-.54-.52zm-2.08-5.72c.26-.26.29-.66.09-.95C5.68 10.74 5 8.7 5 6.5c0-.88.11-1.74.32-2.56l1.09 1.09c.3.3.79.29 1.08-.02.28-.3.25-.78-.04-1.07L5.21 1.71a.9959.9959 0 0 0-1.41 0L1.53 3.97c-.3.3-.29.79.02 1.08.3.28.78.25 1.07-.04L3.8 3.82c-.2.86-.3 1.76-.3 2.68 0 2.51.77 4.85 2.09 6.77.27.39.82.45 1.16.11z"})
                                       "SwipeUpRounded"))
