(ns todomvc-reagent-template.prod
  (:require [todomvc-reagent-template.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
