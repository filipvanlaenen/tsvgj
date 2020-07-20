# Typed Scalable Vector Graphics (SVG) in Java (TSVGJ)

This project aims to provide a domain-specific language (DSL) to create SVG
(Scalable Vector Graphics) files in Java in an easy way, with all the advantages
of typing. Below is a short list of the features it intends to implement:

* Make it almost as easy to read and write SVG producing code in Java as it is
  to read and write an SVG file in a text editor
* Use the advantages of typing, such that the Java compiler can validate much
  of the SVG code
  * This brings also the advantages of code-completion on SVG producing code
* Coverage of the basic elements and concepts of SVG
  * It is not expected to it will be possible to cover all aspects of all
    elements and concepts of SVG

## Example

To give a better idea of how TSVGJ works, consider the following simple SVG
document, showing a red unit circle in a view box displayed in a 2000×1000
image:

```svg
<svg height="1000" viewBox="-1 -1 2 1" width="2000" xmlns="http://www.w3.org/2000/svg">
  <circle cx="0" cy="0" fill="#FF0000" r="1"/>
</svg>
```

With TSVGJ, this code can be produced and printed to the console using the
following Java code:

```java
  import net.filipvanlaenen.tsvgj.Circle;
  import net.filipvanlaenen.tsvgj.Svg;

  Svg svg = new Svg().width(2000).height(1000).viewBox(-1, -1, 2, 1);
  svg.addElement(new Circle().cx(0).cy(0).r(1).fill(0xFF0000));
  System.out.println(svg.asString());
```

## Getting Started

First of all, you need to obtain a copy of the source code, complile it and
install it locally. Run the following commands to do this:

```
git clone git@github.com:filipvanlaenen/tsvgj.git
cd tsvgj
mvn clean install
```

*Note: If requested by enough people, this library can be deployed to a central
Maven repository ([Issue #1](https://github.com/filipvanlaenen/tsvgj/issues/1)).*

If everything works well, you'll be able to use the TSVGJ library in another
Java project by adding the following dependency in the project's POM file:

```xml
  <dependency>
    <groupId>net.filipvanlaenen</groupId>
    <artifactId>tsvgj</artifactId>
    <version>1.0-SNAPSHOT</version>
  </dependency>
```

Be sure to update to the appropriate version number.

Once the dependency is included, you can start to create SVG documents as
shown in the example above.

## Elements Implemented

Not all SVG elements and concepts have been implemented yet. Below is a list
with the elements that have been (partially) implemented. More elements and
attributes will be implemented as
[requested](https://github.com/filipvanlaenen/tsvgj/issues) or needed by other
projects.

* Document structure elements
  * [svg](https://www.w3.org/TR/SVG/struct.html#SVGElement)
  * [defs](https://www.w3.org/TR/SVG/struct.html#DefsElement) (implicitly)
  * [g](https://www.w3.org/TR/SVG/struct.html#GElement)
* Paths
  * [path](https://www.w3.org/TR/SVG/paths.html#PathElement)
* Basic shapes
  * [circle](https://www.w3.org/TR/SVG/shapes.html#CircleElement)
  * [line](https://www.w3.org/TR/SVG/shapes.html#LineElement)
  * [rect](https://www.w3.org/TR/SVG/shapes.html#RectElement)
* Text
  * [text](https://www.w3.org/TR/SVG/text.html#TextElement)
* Paint servers
  * [pattern](https://www.w3.org/TR/SVG/pservers.html#Patterns)

## Projects Using TSVGJ

The following projects use TSVGJ:
* [SHecC](https://github.com/filipvanlaenen/shecc)
