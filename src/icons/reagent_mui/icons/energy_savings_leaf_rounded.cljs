(ns reagent-mui.icons.energy-savings-leaf-rounded
  "Imports @mui/icons-material/EnergySavingsLeafRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def energy-savings-leaf-rounded (create-svg-icon (e "path" #js {"d" "M12 3c-4.8 0-9 3.86-9 9 0 2.12.74 4.07 1.97 5.61l-1.68 1.68c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l1.68-1.68C7.93 20.26 9.88 21 12 21c2.3 0 4.61-.88 6.36-2.64C20.12 16.61 21 14.3 21 12V5c0-1.1-.9-2-2-2h-7zm3.83 9.26-5.16 4.63c-.16.15-.41.14-.56-.01-.14-.14-.16-.36-.04-.52l2.44-3.33-4.05-.4c-.44-.04-.63-.59-.3-.89l5.16-4.63c.16-.15.41-.14.56.01.14.14.16.36.04.52l-2.44 3.33 4.05.4c.45.04.63.59.3.89z"})
                                                  "EnergySavingsLeafRounded"))
