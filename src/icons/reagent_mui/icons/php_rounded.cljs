(ns reagent-mui.icons.php-rounded
  "Imports @mui/icons-material/PhpRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def php-rounded (create-svg-icon (e "path" #js {"d" "M6.5 10.5h-2v1h2v-1zm13.5 0h-2v1h2v-1zm-7 2h-2v1.75c0 .41-.34.75-.75.75s-.75-.34-.75-.75v-4.5c0-.41.34-.75.75-.75s.75.34.75.75V11h2V9.75c0-.41.34-.75.75-.75s.75.34.75.75v4.5c0 .41-.34.75-.75.75s-.75-.34-.75-.75V12.5zm5 1.75c0 .41-.34.75-.75.75s-.75-.34-.75-.75V10c0-.55.45-1 1-1H20c.83 0 1.5.68 1.5 1.5v1c0 .82-.67 1.5-1.5 1.5h-2v1.25zM3 10c0-.55.45-1 1-1h2.5c.83 0 1.5.68 1.5 1.5v1c0 .82-.67 1.5-1.5 1.5h-2v1.25c0 .41-.34.75-.75.75S3 14.66 3 14.25V10z"})
                                  "PhpRounded"))
