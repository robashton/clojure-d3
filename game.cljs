(ns d3demo)

(defn ^:export init []
(draw-circle)
)

(def svg-container 
 	(-> (.select js/d3 "body")
	(.append "svg")
	(.attr "width" 200)
	(.attr "height" 200)))

(defn draw-circle [] 
	(-> (.append svg-container "circle")
	(.attr "cx" 30)
	(.attr "cy" 30)
	(.attr "r" 20)))



	


