(ns produzig.core
  (:require [ziggurat.producer :refer [send]]
            [mount.core :as mount]))

(defn -main []
  (mount/start)
  (ziggurat.producer/send :default "test-topic" (int 1) "key" "poor gesture"))
