(ns reagent-mui.icons.swipe-up
  "Imports @mui/icons-material/SwipeUp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swipe-up (create-svg-icon (e "path" #js {"d" "M2.06 5.56 1 4.5 4.5 1 8 4.5 6.94 5.56 5.32 3.94C5.11 4.76 5 5.62 5 6.5c0 2.42.82 4.65 2.2 6.43L6.13 14C4.49 11.95 3.5 9.34 3.5 6.5c0-.92.1-1.82.3-2.68L2.06 5.56zm11.79 6.06-2.68-5.37c-.37-.74-1.27-1.04-2.01-.67-.75.38-1.05 1.28-.68 2.02l4.81 9.6-3.24.8c-.33.09-.59.33-.7.66L9 19.78l6.19 2.25c.5.17 1.28.02 1.75-.22l5.51-2.75c.89-.45 1.32-1.48 1-2.42l-1.43-4.27c-.27-.82-1.04-1.37-1.9-1.37h-4.56c-.31 0-.62.07-.89.21l-.82.41"})
                               "SwipeUp"))
