(defproject levelwhen "0.1.0-SNAPSHOT"
  :description "Like EventStore but better"
  :url "https://github.com/berdario/levelWHEN"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojurescript "0.0-2202"]
                 [org.clojure/core.async "0.1.278.0-76b25b-alpha"]]
  :node-dependencies [[levelup "0.18.2"]
                      [leveldown "0.10.2"]]
  :plugins [[lein-npm "0.4.0"]
            [lein-cljsbuild "1.0.3"]]
  :source-paths ["src"]
  :cljsbuild {:builds [{:id "levelwhen"
                        :source-paths ["src"]
                        :compiler {:output-to "server.js"
                                   :output-dir "out"
                                   :target :nodejs
                                   :optimizations :none
                                   :pretty-print true}}]}
  :nodejs {:scripts {:test "echo \"Error: no test specified\" && exit 1"}})
