(defproject tinsel-cljs-test "0.1.0-SNAPSHOT"
  :description "Testing using Tinsel in CLJS w/hiccups"
  :url "http://github.com/ddellacosta/tinsel-cljs-test"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2014"]
                 [hiccups "0.2.0"]
                 [hickory "0.5.2"]
                 [org.clojure/core.async "0.1.242.0-44b1e3-alpha"]
                 [tinsel "0.5.0"]]
  :plugins [[lein-cljsbuild "1.0.0-alpha1"]]
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "tinsel-cljs-test"
              :source-paths ["src"]
              :compiler {
                :output-to "tinsel_cljs_test.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})

