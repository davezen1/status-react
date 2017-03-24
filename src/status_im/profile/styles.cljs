(ns status-im.profile.styles
  (:require-macros [status-im.utils.styles :refer [defstyle]])
  (:require [status-im.components.styles :refer [color-white
                                                 color-black
                                                 color-gray4
                                                 color-gray5
                                                 color-light-gray
                                                 color-light-blue
                                                 color-light-blue-transparent
                                                 text1-color]]
            [status-im.utils.platform :as p]))

(def profile
  {:flex             1
   :background-color color-light-gray
   :flex-direction   :column})

(def profile-form
  {:background-color color-white
   :padding          16})

(def edit-my-profile-form
  {:background-color color-white
   :flex             1})

(defstyle profile-info-container
  {:background-color color-white})

(defstyle profile-actions-container
  {:background-color color-white
   :android    {:padding-top    8
                :padding-bottom 8}})

(def profile-bage
  {:flex-direction :row})

(def edit-profile-bage
  {:flex-direction :row
   :align-items    :center
   :padding-left   24
   :padding-top    25})

(defstyle edit-profile-name-container
  {:flex 1
   :ios     {:padding-left 32}
   :android {:padding-top  16
             :padding-left 16}})

(def edit-name-title
  {:color   color-gray4
   :ios     {:font-size      13
             :letter-spacing -0.1}
   :android {:font-size 12}})

(defstyle profile-name-text
  {:ios      {:font-size      17
              :line-height    20
              :letter-spacing -0.2}
   :android  {:color       color-black
              :font-size   16
              :line-height 24}})

(def profile-bage-name-container
  {:flex            1
   :justify-content :center
   :padding-left    16})

(def profile-status-container
  {:margin-top 4})

(defstyle profile-activity-status-text
  {:color   color-gray4
   :ios     {:font-size      14
             :line-height    20
             :letter-spacing -0.2}
   :android {:font-size   15
             :line-height 20}})

(defstyle profile-setting-item
  {:flex-direction :row
   :align-items    :center
   :ios            {:padding-left  16
                    :padding-right 16
                    :height        73}
   :android        {:padding-left  72
                    :padding-right 13
                    :height        72}})

(def profile-setting-text-container
  {:flex          1
   :padding-right 20})

(defstyle profile-setting-title
  {:color   color-gray4
   :ios     {:font-size      14
             :letter-spacing -0.2}
   :android {:font-size 12}})

(defstyle profile-setting-text
  {:ios     {:font-size      17
             :letter-spacing -0.2}
   :android {:font-size 16
             :color     color-black}})

(defstyle profile-setting-spacing
  {:ios     {:height 10}
   :android {:height 7}})

(def info-item-separator
  {:margin-left      16})

(def profile-name-wrapper
  {:padding-top    0
   :margin-top     0
   :margin-bottom  0
   :height         42
   :padding-bottom 0})

(def edit-line-color
  (if p/ios?
    (str color-gray5 "80")
    color-gray5))

(def profile-focus-line-color
  color-light-blue)

(def profile-focus-line-height
  (get-in p/platform-specific [:component-styles :text-field-focus-line-height]))

(defstyle profile-name-input
  {:color   text1-color
   :ios     {:font-size      17
             :padding-bottom 0
             :line-height    17
             :letter-spacing -0.2}
   :android {:font-size      16
             :line-height    16
             :padding-top    5
             :height         30
             :padding-bottom 0}})

(defstyle profile-status-input
  {:height       74
   :line-height  24;;TODO doesnt' work for multiline because a bug in the RN
   :color        text1-color
   :padding-left 0
   :ios          {:font-size      17
                  :padding-bottom 0
                  :padding-top    0
                  :letter-spacing -0.2}
   :android      {:font-size      16
                  :padding-top    5
                  :height         30
                  :padding-bottom 0}})

(def profile-status-text
  (merge profile-status-input
         {:height nil}))

(defstyle edit-profile-status
  {:background-color color-light-gray
   :border-radius    4
   :height           106
   :padding-horizontal          16
   :padding-bottom      16
   :ios {:padding-top 10}
   :margin-left      16
   :margin-right     16
   :margin-top       24})

