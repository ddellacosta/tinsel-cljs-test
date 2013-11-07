(ns tinsel-cljs-test.core
  (:require
   [hickory.select :as select]
   [tinsel.core :as tinsel])
  (:require-macros
   [tinsel.macros :refer [deftemplate]]));; set-content]]))

(defn log [s] (.log js/console s))

(def tmpl
  (tinsel.core/html-fragment "<div><span class=\"foo\"></span><span class=\"bar\"></div>"))

(deftemplate test-tmpl [[:h1.foo "Just a Simple Template"]]
  [test]
;;  (hickory.select/class :foo)
;;  (tinsel.macros/set-content "THIS IS A TEST WORK DAMN YOU foo")
  (tinsel.macros/append-content (str "<p>" test "</p>")))

(log tmpl)

(.log js/console (test-tmpl "test"))
