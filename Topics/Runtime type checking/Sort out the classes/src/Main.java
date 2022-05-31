import java.util.List;

class Sort {
    public static void sortShapes(Shape[] array,
                                  List<Shape> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        for (Shape shape:array
             ) {
            if(shape.getClass() != Shape.class && shape instanceof Shape shapee) {
                shapes.add(shapee);
            }
            if(shape.getClass() != Shape.class && shape instanceof Circle circle) {
                circles.add(circle);
            }

            if(shape.getClass() != Shape.class && shape instanceof Polygon polygon) {
                polygons.add(polygon);
            }

            if(shape.getClass() != Polygon.class && shape instanceof Square square) {
                squares.add(square);
            }
        }
    }


}

//Don't change classes below
class Shape { }
class Polygon extends Shape { }
class Square extends Polygon { }
class Circle extends Shape { }