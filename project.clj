(defproject sherlock "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "All Rights Reserved"}
  :repositories {"my.datomic.com" {:url "https://my.datomic.com/repo"
                                   :username :env/datomic_username
                                   :password :env/datomic_password}}
  :deploy-repositories [["clojars" {:url      "https://clojars.org/repo"
                                    :username :env/clojars_username
                                    :password :env/clojars_password}]]
  :injections [(require 'common-labsoft.misc)
               (require 'common-labsoft.time)]
  :plugins [[lein-midje "3.2.1"]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [labsoft-2018/common-labsoft "0.8.0-SNAPSHOT"]]
  :resource-paths ["resources"]
  :min-lein-version "2.0.0"
  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "sherlock.service/start"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.5.3"]]}
             :uberjar {:aot [sherlock.service]}}
  :main ^{:skip-aot true} sherlock.service)
