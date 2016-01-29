(ns spotx-pinger.core
  (:require [clojure.xml :as xml])
  (:gen-class))

(defn -main [& args]
  (let [url (get (vec args) 0 "http://search.spotxchange.com/vast/2.00/85394?VPAID=js&content_page_url=http://lolwut.nao.cheeseburger.com&cb=123&player_width=300&player_height=250")]
    (println "Fetching " url)
    (loop [i 1000]
      (println (java.util.Date.) i "Ok")
      (let [res (xml/parse url)
            has-conent? (-> res :content nil? not)]
        (if (and has-conent? (> i 0))
          (recur (dec i))
          (println "Got empty reponse")))))
      (println "Finished"))
