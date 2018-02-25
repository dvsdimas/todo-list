(ns todo-list.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]]
            [todo-list.handlers.handler :as handler])
  (:gen-class))

(defn -main [port]
  (jetty/run-jetty #'handler/app {:port (Integer. port)}))
