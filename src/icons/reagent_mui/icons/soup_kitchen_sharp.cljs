(ns reagent-mui.icons.soup-kitchen-sharp
  "Imports @mui/icons-material/SoupKitchenSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def soup-kitchen-sharp (create-svg-icon (e "path" #js {"d" "M6.4 7c-.34.55-.4.97-.4 1.38C6 9.15 7 11 7 12c0 .95-.4 1.5-.4 1.5H5.1s.4-.55.4-1.5c0-1-1-2.85-1-3.62 0-.41.06-.83.4-1.38h1.5zm5 0c-.34.55-.4.97-.4 1.38 0 .77 1 2.62 1 3.62 0 .95-.4 1.5-.4 1.5h1.5s.4-.55.4-1.5c0-1-1-2.85-1-3.62 0-.41.06-.83.4-1.38h-1.5zM8.15 7c-.34.55-.4.97-.4 1.38 0 .77 1 2.63 1 3.62 0 .95-.4 1.5-.4 1.5h1.5s.4-.55.4-1.5c0-1-1-2.85-1-3.62 0-.41.06-.83.4-1.38h-1.5zm13.32-.5s.13-1.06.13-1.5c0-1.65-1.35-3-3-3-1.54 0-2.81 1.16-2.98 2.65L14.53 15H2.93c-.02 3.87 3.09 7 6.82 7 3.48 0 6.34-2.73 6.71-6.23L17.61 4.9c.05-.51.47-.9.99-.9.55 0 1 .45 1 1 0 .3-.1 1.25-.1 1.25l1.97.25z"})
                                         "SoupKitchenSharp"))
