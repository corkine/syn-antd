(ns syn-antd.icons.history-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/HistoryOutlined" :default HistoryOutlined]))

(def history-outlined (reagent.core/adapt-react-class HistoryOutlined))