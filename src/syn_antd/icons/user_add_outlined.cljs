(ns syn-antd.icons.user-add-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/UserAddOutlined" :default UserAddOutlined]))

(def user-add-outlined (reagent.core/adapt-react-class UserAddOutlined))