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
