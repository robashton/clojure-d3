(ns d3demo)

(defn ^:export init []
  (let [a "a"]
    (.style (.select js/d3 "body") "background-color" "black")))





