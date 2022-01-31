(ns clojure-noob.core
  (:gen-class))

;define function main
(defn main [severity]
  (println (str "We're")
    (if (= severity :mild)
      "mildly inconvenienced."
      (if (= severity :severe)
        "doomed."
        "OK?"))))

(main :mild)

;define main function, same as the one above
(defn main [severity]
  (println "We're" (severity {:mild "mildly inconvenienced." :severe "doomed."} "OK.")))

(main :severe)
