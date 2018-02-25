(defproject todo-list "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.6.3"]
                 [compojure "1.6.0"]]
  :min-lein-version "2.0.0"
  :uberjar-name "todo-list.jar"
  :main todo-list.core
  :target-path "target/%s"
  :profiles {:dev {:main todo-list.dev-core}})
