(ns levelwhen.core)

(comment ; execute this to activate the node cljs repl
  (require '[cljs.repl.node :as node])
  (node/run-node-nrepl))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
