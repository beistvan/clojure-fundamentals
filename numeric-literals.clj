;; Numeric Literals

(def hundred 100)

(def my-floating-point 100.123456)

(def my-ratio 10/7)

(numerator my-ratio)

(denominator my-ratio)

(println hundred) ;;=> 100

(println my-floating-point) ;;=> 100.123456

(println my-ratio) ;;=> 10/7

(println (numerator my-ratio)) ;;=> 10

(println (denominator my-ratio)) ;;=> 7

(println (numerator (/ 2 3)));;=> 2