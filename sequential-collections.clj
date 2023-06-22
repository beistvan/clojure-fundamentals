;; Sequential Collections

(def my-vector [1 2 3])

(get my-vector 0)


(def my-list `(1 2 3))

(first my-list)


(println my-vector) ;;=> [1 2 3]

(println (get my-vector 0)) ;;=> 1

(println my-list) ;;=> (1 2 3)

(println (first my-list)) ;;=> 1