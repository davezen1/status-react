(ns status-im.components.action-button.styles
  (:require-macros [status-im.utils.styles :refer [defstyle]])
  (:require [status-im.utils.platform :as p]
            [status-im.components.styles :refer [color-white
                                                 color-light-blue-transparent
                                                 color-light-blue
                                                 color-light-gray
                                                 color-black
                                                 color-gray4]]))

(def action-button
  (merge (get-in p/platform-specific [:component-styles :action-button])
         {:padding-left   16
          :flex-direction :row
          :align-items    :center}))

(def action-button-icon-container
  (merge (get-in p/platform-specific [:component-styles :action-button-icon-container])
         {:border-radius    50
          :width            40
          :height           40
          :align-items      :center
          :justify-content  :center}))

(def action-button-label-container
  {:padding-left 16})

(def action-button-label
  (get-in p/platform-specific [:component-styles :action-button-label]))

(def action-separator
  {:margin-left 72})

(def action-button-label-disabled
  (merge action-button-label
         {:color color-gray4}))

(defstyle action-button-icon-container-disabled
  {:border-radius    50
   :width            40
   :height           40
   :align-items      :center
   :justify-content  :center
   :ios              {:background-color color-light-gray}})

