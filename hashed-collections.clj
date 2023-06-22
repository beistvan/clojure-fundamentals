;; Hashed Collections

#{"István" "James" "Eleanor"}

(contains? #{"István" "James"} "István")


{:Istvan 1, :James 8, :Eleanor 10}

{:Istvan 1 :James 8 :Eleanor 10}

(assoc {:Istvan 1} :Brian 12)


(println #{"István" "James" "Eleanor"}) ;;=> #{James Eleanor István}

(println {:Istvan 1, :James 8, :Eleanor 10}) ;;=> {:Istvan 1, :James 8, :Eleanor 10}

(println {:Istvan 1 :James 8 :Eleanor 10}) ;;=> {:Istvan 1, :James 8, :Eleanor 10}

(println (contains? #{"István" "James"} "István")) ;;=> true

(println (assoc {:Istvan 1} :Brian 12)) ;;=> {:Istvan 1, :Brian 12}