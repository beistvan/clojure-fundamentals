;; Hashed Collections

#{"Istv�n" "James" "Eleanor"}

(contains? #{"Istv�n" "James"} "Istv�n")


{:Istvan 1, :James 8, :Eleanor 10}

{:Istvan 1 :James 8 :Eleanor 10}

(assoc {:Istvan 1} :Brian 12)


(println #{"Istv�n" "James" "Eleanor"}) ;;=> #{James Eleanor Istv�n}

(println {:Istvan 1, :James 8, :Eleanor 10}) ;;=> {:Istvan 1, :James 8, :Eleanor 10}

(println {:Istvan 1 :James 8 :Eleanor 10}) ;;=> {:Istvan 1, :James 8, :Eleanor 10}

(println (contains? #{"Istv�n" "James"} "Istv�n")) ;;=> true

(println (assoc {:Istvan 1} :Brian 12)) ;;=> {:Istvan 1, :Brian 12}