(ns reagent-mui.material.slide
  "Imports @mui/material/Slide as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/slide/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Slide" :as MuiSlide]))

(def slide (adapt-react-class (.-default MuiSlide) "mui-slide"))
