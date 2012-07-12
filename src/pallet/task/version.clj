(ns pallet.task.version
  "Print the pallet version")

(defn version
  "Print the pallet version"
  {:no-service-required true}
  []
  (println "Pallet" (System/getProperty "pallet.version")
           "on Java" (System/getProperty "java.version")
           (System/getProperty "java.vm.name")))
