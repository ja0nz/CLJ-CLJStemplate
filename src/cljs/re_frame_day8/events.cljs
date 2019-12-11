(ns re-frame-day8.events
  (:require
   [re-frame.core :as re-frame]
   [re-frame-day8.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced defn-traced]]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _]
   db/default-db))
