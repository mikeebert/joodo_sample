(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "joodo_sample"]
  (include-css "/stylesheets/joodo_sample.css")
  (include-js "/javascript/joodo_sample.js")]
 [:body
  (eval (:template-body joodo.views/*view-context*))
]]