(use 'joodo.env)

(def environment {
  :joodo.core.namespace "joodo_sample.core"
  ; environment settings go here
  })

(swap! *env* merge environment)