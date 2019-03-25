
(defproject structured-data "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [midje "1.7.0"]
                 [nrepl "0.4.5"]
                 [iloveponies.tests/p-p-p-pokerface  "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:plugins [[lein-midje "3.2-RC4"] [cider/cider-nrepl "0.18.0"]]}})