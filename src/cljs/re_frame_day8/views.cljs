(ns re-frame-day8.views
  (:require
   [re-frame.core :as re-frame]
   [re-frame-day8.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     ]))
