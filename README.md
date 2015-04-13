Clojurescript on node.js toying
--------------------------------

Install leiningen
------------

see http://leiningen.org/#install

Compile
------

````bash
lein cljsbuild once
````

Run on node
-----------

````bash
node app.js
````

Interesting bits
---------------

* `src/hello-world/core.cljs`: starting point of the cljs program
* `app.js`: app bootstrapper
* `projet.clj` build description for lein
