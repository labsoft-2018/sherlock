(ns sherlock.service-test
  (:require [midje.sweet :refer :all]
            [sherlock.service :as ser]
            [common-labsoft.test-helpers :as th]))

(th/with-service [ser/start! ser/stop!] [system service]
 (fact "Http Test"
   (th/request! service :get "/") => {:res "Hello, World!"}))
