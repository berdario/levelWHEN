(ns levelwhen.core
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.core.async :refer [put! chan <!]]))

(def leveldb (js/require "levelup"))

(def db (leveldb ".db"))
(defn -main []
  (.put db "name" "'levelup!'")
  (.get db "name" print))
