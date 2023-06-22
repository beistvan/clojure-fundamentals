;; Keywords

:foobar

::foobar

; Keywords are used with maps

(def my-map {:Istvan 1 :Eva 2})

(get my-map :Istvan)

(:Istvan my-map)


(println :foobar) ;;=> :foobar

(println ::foobar) ;;=> :user/foobar

(println my-map) ;;=> {:Istvan 1 :Eva 2}

(println (get my-map :Istvan)) ;;=> 1

(println (:Istvan my-map)) ;;=> 1