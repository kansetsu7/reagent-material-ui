(ns reagent-mui.icons.lock-reset-outlined
  "Imports @mui/icons-material/LockResetOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def lock-reset-outlined (create-svg-icon (e "path" #js {"d" "M13 3c-4.97 0-9 4.03-9 9 0 .06.01.12.01.19l-1.84-1.84-1.41 1.41L5 16l4.24-4.24-1.41-1.41-1.82 1.82c0-.06-.01-.11-.01-.17 0-3.86 3.14-7 7-7s7 3.14 7 7-3.14 7-7 7c-1.9 0-3.62-.76-4.88-1.99L6.7 18.42C8.32 20.01 10.55 21 13 21c4.97 0 9-4.03 9-9s-4.03-9-9-9zm2 8v-1c0-1.1-.9-2-2-2s-2 .9-2 2v1c-.55 0-1 .45-1 1v3c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-3c0-.55-.45-1-1-1zm-1 0h-2v-1c0-.55.45-1 1-1s1 .45 1 1v1z"})
                                          "LockResetOutlined"))
