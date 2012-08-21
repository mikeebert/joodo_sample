(ns joodo_sample.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [joodo.middleware.view-context :only (wrap-view-context)]
    [joodo.views :only (render-template render-html)]
    [joodo.controllers :only (controller-router)]))

(defroutes joodo_sample-routes
  (GET "/" [] (render-template "index"))
  (controller-router 'joodo_sample.controller)
  (not-found (render-template "not_found" :template-root "joodo_sample/view" :ns `joodo_sample.view.view-helpers)))

(def app-handler
  (->
    joodo_sample-routes
    (wrap-view-context :template-root "joodo_sample/view" :ns `joodo_sample.view.view-helpers)))

