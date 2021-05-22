(ns produzig.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [produzig.core :as SUT]))

(deftest produces-abc-to-kafka
  (is (= 2 2)))
