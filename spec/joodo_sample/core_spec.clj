(ns joodo_sample.core-spec
  (:use
    [speclj.core]
    [joodo.spec-helpers.controller]
    [joodo_sample.core]))

(describe "joodo_sample"

  (with-mock-rendering)
  (with-routes app-handler)

  (it "handles home page"
    (let [result (do-get "/")]
      (should= 200 (:status result))
      (should= "index" @rendered-template)))
  )

(run-specs)
