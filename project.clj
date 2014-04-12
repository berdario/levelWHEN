(defproject levelwhen "0.1.0-SNAPSHOT"
  :description "Like EventStore but better"
  :url "https://github.com/berdario/levelWHEN"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojurescript "0.0-2202"]
                 [org.bodil/cljs-noderepl "0.1.11"]]
  :plugins [[lein-npm "0.4.0"]]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :nodejs {:scripts {:test "echo \"Error: no test specified\" && exit 1"}})
