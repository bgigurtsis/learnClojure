(ns clojure-noob.core
  (:gen-class))

(defn main [severity]
  (println "We're" (severity {:mild "mildly inconvenienced." :severe "doomed."} "OK.")))
