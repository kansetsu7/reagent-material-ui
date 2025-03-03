(ns reagent-mui.base.switch-unstyled
  "Imports @mui/base/SwitchUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/switch-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/SwitchUnstyled" :as MuiSwitchUnstyled]))

(def switch-unstyled (adapt-react-class (.-default MuiSwitchUnstyled) "mui-switch-unstyled"))
