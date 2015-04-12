(ns helloworld.core
  (:require [cljs.nodejs :as node]))

(def express (node/require "express"))
(def port 3000)

(def hello-world-router (.Router express))
(.get hello-world-router "/", (fn [req res]
  (.send res "Hello World")))

(let [app (express)]
  (doto app
    (.use hello-world-router)
    (.listen port)))

(.log js/console (str "Express server started on port: "
                      port))

