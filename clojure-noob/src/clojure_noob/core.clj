(ns clojure-noob.core
  (:gen-class))

;define function main
(defn -main
  ;define argument 'severity'
  [severity]
  (str "Disaster We're "
    (if (= severity :mild)
      "Mildly inconvenienced")
    (if (= severity :severe)
      "Doomed"
      "ok?")))

(-main :mild)
