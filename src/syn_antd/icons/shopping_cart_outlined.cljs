(ns syn-antd.icons.shopping-cart-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/ShoppingCartOutlined" :default ShoppingCartOutlined]))

(def shopping-cart-outlined (reagent.core/adapt-react-class ShoppingCartOutlined))