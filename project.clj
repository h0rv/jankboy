(defproject jankboy "0.1-SNAPSHOT"
  :description "A handwritten Game Boy CPU learning project"
  :dependencies []
  :plugins [[org.jank-lang/lein-jank "2026.10-3"]]
  :middleware [leiningen.jank/middleware]
  :main jankboy.main
  :profiles {:repl {:source-paths ["dev"]
                    :main jankboy.repl}
             :base {:jank {:target-dir "target/debug"
                           :optimization-level 0}}
             :release {:jank {:target-dir "target/release"
                              :optimization-level 3}}})
