;; String Literals

(def hello "Hello Vil�g!")

(def i-char \I)

(def my-regexp #"[A-Z]")

(println hello)

(println i-char)

(println my-regexp)

(println (re-matches #"abc" "abc") ) ;;=> "abc"

(println (re-matches my-regexp "abc") ) ;;=> "nil"

(println (re-matches my-regexp "B") ) ;;=> "B"