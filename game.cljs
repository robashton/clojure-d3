(ns d3demo)

(defn ^:export init []
	(mouse 50 50)
	(mouse 200 200))

(def svg-container 
 	(-> (.select js/d3 "body")
	(.append "svg")
	(.attr "width" 1000)
	(.attr "height" 1000)))

(defn circle [x y r] 
	(-> 
  (.append svg-container "circle")
	(.attr "cx" x)
	(.attr "cy" y)
	(.attr "r" r)))

(defn mouse [x y]
	(circle (+ x 30) (+ y 30) 20)
	(circle (+ x 90) (+ y 30) 20)
	(circle (+ x 60) (+ y 65) 30))
	
(js/setInterval (fn []
    (->
       (.selectAll svg-container "circle")
       (.transition)
       (.duration 250)
       (.style "fill" (js/get_random_color))))
      250)
    



