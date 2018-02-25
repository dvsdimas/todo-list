(ns todo-list.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]]
            [todo-list.handlers.handler :as handler]
            [environ.core :refer [env]])
  (:gen-class))

(defn start-app [handler port]
  (let [port (Integer. (or port (env :port) 8000))]
    (jetty/run-jetty handler {:port port :join? false})))

(defn -main [& [port]]
  (start-app #'handler/app port))
