# project plugins

## [sbt-buildinfo](https://github.com/sbt/sbt-buildinfo)

exposes build metadata to application

### install

```scala
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.3.1")
```

### use

j2ee extensions

```scala
buildInfoSettings
```

## [xsbt-web](https://github.com/earldouglas/xsbt-web-plugin)

### install

```scala
addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.9.0")
```

### use

```scala
webSettings
```

## [sbt-assembly](https://github.com/sbt/sbt-assembly)

self contained jar packaging

### install

```scala
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")
```

### use

```scala
assemblySettings
```

## [sbt-dependency-graph](https://github.com/jrudolph/sbt-dependency-graph)

view direct and transient dependencies as a graph or tree

### install

```scala
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")
```

### use

```scala
graphSettings
```

# library dependencies

## [unfiltered](https://github.com/unfiltered/unfiltered) ( compile )

* filter module - provides interfaces for building servlet filters from partial functions
* jetty module - provides embedded jetty server builder interface

### install

```scala
"net.databinder" % "unfiltered-filter_2.11" % "0.8.0"
"net.databinder" % "unfiltered-jetty_2.11"  % "0.8.0"
```

## [scalatest](http://scalatest.org/) ( test )

a unit testing library

### install

```scala
"org.scalatest" %% "scalatest" % "2.1.5" % "test"
```
