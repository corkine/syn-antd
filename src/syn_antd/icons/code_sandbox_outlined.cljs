(ns syn-antd.icons.code-sandbox-outlined
  (:require
    [reagent.core]
    ["@ant-design/icons/es/icons/CodeSandboxOutlined" :default CodeSandboxOutlined]))

(def code-sandbox-outlined (reagent.core/adapt-react-class CodeSandboxOutlined))