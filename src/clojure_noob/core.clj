(ns clojure-noob.core
  (:gen-class))

(defn addHundred
  [number]
  (+ number 100)
)

(defn evaluateMoneybox 
  [moneybox]
  (def size (count moneybox))
  (for [x (range size) y (range size) :let [v (get-in moneybox [x y])]]
    v 
  )
)

(defn -main
  "I'm gonna print out all the numbers in the money box"
  [& args]
  (evaluateMoneybox [[0 0 0 0] [6 2 4 1] [7 3 8 2] [9 7 9 4]])
)
