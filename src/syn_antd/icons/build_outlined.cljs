(ns syn-antd.icons.build-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/BuildOutlined" :default BuildOutlined]))

(def build-outlined (reagent.core/adapt-react-class BuildOutlined))