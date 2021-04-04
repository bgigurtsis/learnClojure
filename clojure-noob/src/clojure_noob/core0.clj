(ns clojure-noob.core
  (:gen-class))

;define function main
(defn main
  ;define argument 'severity'
  [severity]
  (println (str "We're")
    (if (= severity :mild)
      "mildly inconvenienced."
      (if (= severity :severe)
        "doomed."
        "OK?"))))

(main :mild)
