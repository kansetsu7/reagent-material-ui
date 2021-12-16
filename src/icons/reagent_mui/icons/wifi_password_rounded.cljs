(ns reagent-mui.icons.wifi-password-rounded
  "Imports @mui/icons-material/WifiPasswordRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wifi-password-rounded (create-svg-icon (e "path" #js {"d" "M18.49 12.13C16.67 10.79 14.43 10 12 10c-2.43 0-4.67.79-6.49 2.13-.72.53-.76 1.6-.13 2.24.53.54 1.37.57 1.98.12C8.67 13.55 10.27 13 12 13c1.73 0 3.33.55 4.64 1.49.62.44 1.45.41 1.98-.12.64-.64.6-1.71-.13-2.24zm4.31-4.24C19.86 5.46 16.1 4 12 4S4.14 5.46 1.2 7.89c-.67.55-.71 1.58-.09 2.21.55.55 1.42.58 2.02.09C5.55 8.2 8.64 7 12 7s6.45 1.2 8.87 3.19c.6.49 1.47.46 2.02-.09.62-.63.58-1.66-.09-2.21zM12 16c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm11 3v-1c0-1.1-.9-2-2-2s-2 .9-2 2v1c-.55 0-1 .45-1 1v3c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-3c0-.55-.45-1-1-1zm-1 0h-2v-1c0-.55.45-1 1-1s1 .45 1 1v1z"})
                                            "WifiPasswordRounded"))
