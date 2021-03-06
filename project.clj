(defproject helloworld "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2755"]]

  :node-dependencies [[source-map-support "0.2.8"]
                      [express "4.12.3"]]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-npm "0.4.0"]]
  :min-lein-version "2.0.0"
  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "helloworld"
              :source-paths ["src"]
              :compiler {
                :output-to "out/helloworld.js"
                :output-dir "out"
                :target :nodejs
                :optimizations :none
                :source-map true}}]})
