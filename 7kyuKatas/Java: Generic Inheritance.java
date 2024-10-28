/*
I am creating a class hierarchy of geometrical Shapes. This is my base class:
abstract class Shape {
    public abstract double getArea();
}
And this is a circle:
class Circle extends Shape {
    public final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
There are other shapes, like Rectangles, Squares, etc.
I also wrote an utility class ShapeUtilities. One of those utilities is a function that computes the total area of a list of shapes:
public static double sumAllAreas(List<Shape> shapes) {
    double totalArea = 0.0;
    for (Shape shape : shapes)
        totalArea += shape.getArea();
    return totalArea;
}
This seems to work fine:
List<Shape> shapes = List.of(new Circle(2), new Rectangle(3, 3), new Square(2));
double totalArea = ShapeUtilities.sumAllAreas(shapes); // 25.567
But when I try to call it with a List<Circle>, the code does not compile, even though Circle inherits from Shape :(

List<Circle> circles = List.of(new Circle(2), new Circle(1), new Circle(5));
double totalArea = ShapeUtilities.sumAllAreas(circles); // compilation error !
Can you fix the code so that sumAllAreas() works with Shape and all its subtypes ?
*/

import java.util.*;

class ShapeUtilities {
    public static double sumAllAreas(List<? extends Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes)
            totalArea += shape.getArea();
        return totalArea;
    }
}
