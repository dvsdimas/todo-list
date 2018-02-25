(ns todo-list.dev-core
  (:require [ring.middleware.reload :refer [wrap-reload]]
            [todo-list.handlers.handler :as handler]
            [environ.core :refer [env]]
            [todo-list.core :refer [start-app]])
  (:gen-class))

(defn -main [& [port]]
  (start-app (wrap-reload #'handler/app) port))