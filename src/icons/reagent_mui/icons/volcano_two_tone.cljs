(ns reagent-mui.icons.volcano-two-tone
  "Imports @mui/icons-material/VolcanoTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def volcano-two-tone (create-svg-icon [(e "path" #js {"d" "M16.49 10h-4.14l-1.49 3.74-.51 1.26H7.3l-2.22 5h14.27z", "opacity" ".3"}) (e "path" #js {"d" "M18 8h-7l-2 5H6l-4 9h20L18 8zM7.3 15h3.05l.5-1.26 1.5-3.74h4.14l2.86 10H5.08l2.22-5zM13 1h2v4h-2zm3.1212 4.4683L18.9496 2.64l1.4142 1.4142-2.8284 2.8284zm-8.4815-1.418 1.4142-1.4142 2.8284 2.8284-1.4142 1.4142z"})]
                                       "VolcanoTwoTone"))
