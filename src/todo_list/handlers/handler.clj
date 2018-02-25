(ns todo-list.handlers.handler
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :refer [not-found]]
            [ring.handler.dump :refer [handle-dump]]))

(defn- greet [_]
  {:status  200
   :body    "Hello, World !!!"
   :headers {}})

(defn- goodbye [_]
  {:status  200
   :body    "Goodbye, World !!!"
   :headers {}})

(defn- about [_]
  {:status  200
   :body    "My name is Dmitriy. I've made this amazing site !"
   :headers {}})

(defroutes app
           (GET "/" [] greet)
           (GET "/goodbye" [] goodbye)
           (GET "/about" [] about)
           (GET "/request" [] handle-dump)
           (not-found "Page not found."))