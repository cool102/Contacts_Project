class Counter {
    public static int count2DShapes(Shape[] shapes) {
        int shape2Dcounter=0;
        for (Shape sh:shapes
             ) {
            if (sh instanceof Shape2D && sh.getClass() !=Shape2D.class) {
                shape2Dcounter++;
            }
        }
        return shape2Dcounter;
    }
}

// Don't change the code below

class Shape {
}

class Shape2D extends Shape {
}

class Shape3D extends Shape {
}


class Circle extends Shape2D {
}

class Shape2DSub1 extends Shape2D {
}

class Shape2DSub2 extends Shape2D {
}


class Cube extends Shape3D {
}

class Shape3DSub1 extends Shape3D {
}

class Shape3DSub2 extends Shape3D {
}