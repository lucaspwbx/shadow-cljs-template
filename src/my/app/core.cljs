(ns my.app.core
  (:require [reagent.core :as reagent :refer [atom]]))

(defonce app-state (atom {:text "First project"}))

(defn hello-world []
  [:div
   [:h1 (:text @app-state)]
   [:h3 "First commit"]])

(defn start []
  (reagent/render-component [hello-world]
                            (. js/document (getElementById "app"))))

(defn ^:export init []
  (start))

(defn stop []
  (js/console.log "stop"))
