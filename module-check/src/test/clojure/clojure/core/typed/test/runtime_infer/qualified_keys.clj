(ns clojure.core.typed.test.runtime-infer.qualified-keys
  {:lang :core.typed
   :core.typed {:features #{:runtime-infer}}
   }
  (:require [clojure.core.typed :as t]
            [clojure.spec.alpha :as s]
            [clojure.pprint :refer [pprint]]))

;; Start: Generated by clojure.core.typed - DO NOT EDIT
(declare)
(t/ann unqualified AnyFunction)
;; End: Generated by clojure.core.typed - DO NOT EDIT
(defn unqualified []
  {:foo {:foo {:foo nil}}}
  )
(defn qualified []
  {::foo {::foo {::foo nil}}}
  )

(defn qualified2 []
  (rand-nth
    [{::foo2 {::foo nil}}
     {::foo2 {::foo {::foo1 :a}}}
     {::foo2 {::foo {::foo1 :b}}}
     {::foo2 {::foo {::foo1 :c}}}
     ])
  )

(defn same1 []
  {:blah 1
   :flag 2
   :opt1 2
   :opt2 3})

(defn same2 []
  {:blah 1
   :flag 2
   :opt1 2
   :opt3 3})

;(qualified)
(doall (repeatedly 100 qualified2))
;(unqualified)
;(same1)
;(same2)