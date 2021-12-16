(ns reagent-mui.icons.insert-page-break-rounded
  "Imports @mui/icons-material/InsertPageBreakRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def insert-page-break-rounded (create-svg-icon (e "path" #js {"d" "M4 20c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2v-3H4v3zM19.41 7.41l-4.83-4.83c-.37-.37-.88-.58-1.41-.58H6c-1.1 0-1.99.89-1.99 1.99V11H20V8.83c0-.53-.21-1.04-.59-1.42zM13 8V3.5L18.5 9H14c-.55 0-1-.45-1-1zm2 6c0-.55-.45-1-1-1h-4c-.55 0-1 .45-1 1s.45 1 1 1h4c.55 0 1-.45 1-1zm2 0c0 .55.45 1 1 1h4c.55 0 1-.45 1-1s-.45-1-1-1h-4c-.55 0-1 .45-1 1zM6 13H2c-.55 0-1 .45-1 1s.45 1 1 1h4c.55 0 1-.45 1-1s-.45-1-1-1z"})
                                                "InsertPageBreakRounded"))
