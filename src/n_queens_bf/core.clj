(ns n-queens-bf.core
  (:gen-class))

(require '[clojure.math.combinatorics :as comb])

(defn columns-of [board size] (for [i (range size) :let [vi (nth board i)]] [(inc i) vi]))

(defn naname? [[[i vi] [j vj]]] (= (Math/abs (- i j)) (Math/abs (- vi vj))))

(defn ok? [board size] (not-any? naname? (comb/combinations (columns-of board size) 2)))

(defn make-solutions [n]
  (let [candidates (comb/permutations (range 1 (inc n)))]
    (filter (fn [board] (ok? board n)) candidates)))

(defn -main
  "n-queens problem brute force solver"
  [n]
  (let [solutions (make-solutions (. Integer parseInt n))]
    (doseq [s solutions]
      (println s))
    (println (count solutions) "solutions")))
