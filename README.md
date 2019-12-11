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
## How to connect to the browser repl
1. Start the app dev mode
`clj -A:cljs watch app`
This starts:
-> html server at:      localhost:8280
-> browser test server: localhost:8290
-> nRepl server         localhost:8777

2. M-x cider-connect-cljs
   | -> localhost
   | -> 8777
   | -> shadow
   | -> app

## Start karma
```
yarn run karma
```


