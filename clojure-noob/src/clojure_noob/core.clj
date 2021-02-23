(ns clojure-noob.core
  (:gen-class))

(defn -main
  [severity]
  (str "Disaster We're "
    (if (= severity :mild)
      "Mildly inconvenienced"
      "Doomed")))


(-main :mild)
