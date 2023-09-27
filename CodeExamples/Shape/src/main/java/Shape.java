/**
 *
 * @author Ross Lowrance
 */
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        Shape shape = new Circle(); // Polymorphism: Shape reference, Circle object
        shape.draw(); // Calls the overridden method in Circle
    }
}


