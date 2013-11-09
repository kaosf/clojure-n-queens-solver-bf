(defproject n-queens-bf "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MIT"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/math.combinatorics "0.0.6"]]
  :main ^:skip-aot n-queens-bf.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
