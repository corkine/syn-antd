(ns syn-antd.icons.flag-filled
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/FlagFilled" :default FlagFilled]))

(def flag-filled (reagent.core/adapt-react-class FlagFilled))