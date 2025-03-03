(ns reagent-mui.material.table-row
  "Imports @mui/material/TableRow as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/table-row/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/TableRow" :as MuiTableRow]))

(def table-row (adapt-react-class (.-default MuiTableRow) "mui-table-row"))
