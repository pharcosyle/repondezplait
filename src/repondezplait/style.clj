(ns repondezplait.style
  ;; (:refer-clojure :exclude [+ - * /])
  ;; (:require [garden.core :refer [css]]
  ;;           [garden.units :refer [px]]
  ;;           [garden.arithmetic :refer [+ - * /]]
  ;;           [garden.color :refer [lighten]])
  )

(def stylesheet
  "asdf")
  ;; (let [ ; How does this work? Don't these need to be in their own vectors?
  ;;       clearfix [:&:before
  ;;                 :&:after {:content "\" \""
  ;;                           :display "table"}
  ;;                 :&:after {:clear "both"}]
  ;;       center {:margin-left "auto"
  ;;               :margin-right "auto"}


  ;;       white "white"

  ;;       wet-asphalt "#34495E"
  ;;       midnight-blue "#2C3E50"

  ;;       clouds "#ECF0F1"
  ;;       silver "#BDC3C7"

  ;;       concrete "#95A5A6"
  ;;       asbestos "#7F8C8D"

  ;;       turquoise "#1ABC9C"
  ;;       green-sea "#16A085"

  ;;       emerald "#2ECC71"
  ;;       nephritis "#27AE60"

  ;;       peter-river "#3498DB"
  ;;       belize-hole "#2980B9"

  ;;       amethyst "#9B59B6"
  ;;       wisteria "#8E44AD"

  ;;       sunflower "#F1C40F"
  ;;       orange "#F39C12"

  ;;       carrot "#E67E22"
  ;;       pumpkin "#D35400"

  ;;       alizarin "#E74C3C"
  ;;       pomegranite "#C0392B"


  ;;       ;; display-font "'Helvetica Neue', Helvetica, Arial, sans-serif"
  ;;       text-font "'Lato', sans-serif"
  ;;       font-size (px 16)
  ;;       ;; line-height 1.25
  ;;       border-radius (px 4)

  ;;       action-color turquoise
  ;;       action-hover-color (lighten action-color 10)
  ;;       action-active-color green-sea
  ;;       action-transition ".25s linear"

  ;;       gap (px 32)

  ;;       page-width (px 960)

  ;;       container (merge center {:width page-width})
  ;;       row clearfix
  ;;       column {:float "left"
  ;;               ;; :padding "0 15px"
  ;;               }

  ;;       lead {:font-size (px 30)
  ;;             :font-weight 300}

  ;;       white-links [:a {:color white}]
  ;;       gap-bottom {:margin-bottom gap}]
  ;;   (css
  ;;    ;; Normalize.css override
  ;;    [:h1 {:margin 0}]

  ;;    ;; Other normalizing stuff
  ;;    ;; [:p
  ;;    ;;  :blockquote {:margin 0}]

  ;;    ;; Global
  ;;    ;; [:a {:text-decoration "none"
  ;;    ;; 	 :color action-color
  ;;    ;; 	 :transition (str "color " action-transition)}
  ;;    ;; 	[:&:hover {:color action-hover-color}]]
  ;;    ;; [:blockquote {:border-left (str "3px solid " silver)
  ;;    ;; 			  :padding-left (/ gap 2)}
  ;;    ;; 	[:p {:margin-bottom (/ gap 4)}]
  ;;    ;; 	[:footer {:font-style "italic"}]]

  ;;    ;; Components
  ;;    ;; [:.btn {:display "inline-block"
  ;;    ;; 		:cursor "pointer"
  ;;    ;; 		:padding "9px 15px"
  ;;    ;; 		:line-height 1
  ;;    ;; 		:border-radius border-radius
  ;;    ;; 		:color white
  ;;    ;; 		:background-color action-color
  ;;    ;; 		:transition (str "background-color " action-transition)}
  ;;    ;; 	[:&:hover {:background-color action-hover-color}]
  ;;    ;; 	[:&:active {:background-color action-active-color}]]
  ;;    ;; [:a.btn:hover {:color white}]

  ;;    ;; Layout
  ;;    [:body {:font-size font-size
  ;;            :font-family text-font
  ;;            :color wet-asphalt
  ;;            :background-color orange}]
  ;;    [:.site-header {:background-color sunflower}
  ;;     [:header container
  ;;      {:color white
  ;;       :height (px 112)}
  ;;      white-links
  ;;      [:img {:height (px 50)}]]]
  ;;    [:.contents container
  ;;     {:position "relative"
  ;;      :top (- gap)
  ;;      :background-color white}]
  ;;    ["body > footer" container
  ;;     {:color white}
  ;;     white-links]

  ;;    ;; Pages
  ;;    [:.home
  ;;     row
  ;;     [:.intro lead gap-bottom {:width (* page-width 0.75)}]
  ;;     [:.quote gap-bottom
  ;;      row
  ;;      [:blockquote {:float "right"
  ;;                    :width (* page-width 0.75)}]]
  ;;     [:img gap-bottom center {:display "block"}]]
  ;;    [:.inventory
  ;;     row
  ;;     [:aside column
  ;;      {:width (* page-width 0.25)
  ;;       :background-color clouds}
  ;;      (let [color {:color silver}]
  ;;        [:.search gap-bottom
  ;;         ;; [:input:placeholder color]
  ;;         [:i color
  ;;          {:position "relative"
  ;;           :right (px 19)}]])
  ;;      [:.filters {:padding (/ gap 2)}
  ;;       [:.filter gap-bottom
  ;;        [:h1 {:font-size font-size}]
  ;;        [:.options {:margin-left (/ gap 2)}
  ;;         [:label {:line-height 1.75
  ;;                  :margin-bottom 0
  ;;                  :display "block"
  ;;                  :cursor "pointer"
  ;;                  :color action-color
  ;;                  :transition (str "color " action-transition)}
  ;;          [:&:hover {:color action-hover-color}]
  ;;          [:.num-results {:background-color silver}]]]]]]
  ;;     [:section column
  ;;      {:width (* page-width 0.75)
  ;;       ;; This shouldn't be necessary
  ;;       :background-color white}]])))
