(ns todo-list.dev-core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]]
            [todo-list.handlers.handler :as handler])
  (:gen-class))

(defn -main [port]
  (jetty/run-jetty (wrap-reload #'handler/app) {:port (Integer. port)}))