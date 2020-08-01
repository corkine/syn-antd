(ns syn-antd.badge
  (:require
    [reagent.core]
    ["antd/es/badge" :default ant-badge]))

(def badge (reagent.core/adapt-react-class ant-badge))

(def badge-ribbon (reagent.core/adapt-react-class (.-Ribbon ant-badge)))