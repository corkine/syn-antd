(ns syn-antd.icons.environment-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/EnvironmentOutlined" :default EnvironmentOutlined]))

(def environment-outlined (reagent.core/adapt-react-class EnvironmentOutlined))