# Clojure: deps.edn + reframe + shadowcljs template

## Installation
```
yarn
```

## Usage
```
clj -A:test            -> run CLS tests with koacha
clj -A:outdated        -> check if deps are outdated
|-- -a outdated        -> detailed outdated report
|-- --update           -> update deps
clj -A:cljs            -> trigger for shadowcljs
|-- watch app          -> dev mode
|-- release app        -> production realease (in /resources/public)
|-- compile karma-test -> gernerate karma test 
clj -A:cljs-report     -> generate build report
```

To start karma
```
yarn run karma
```
