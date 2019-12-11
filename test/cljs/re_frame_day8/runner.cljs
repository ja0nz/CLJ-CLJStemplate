(ns re-frame-day8.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [re-frame-day8.core-test]))

(doo-tests 're-frame-day8.core-test)
