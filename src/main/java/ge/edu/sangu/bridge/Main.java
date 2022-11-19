package ge.edu.sangu.bridge;

import ge.edu.sangu.bridge.implementations.*;
import ge.edu.sangu.bridge.interfaces.Shape;

public class Main {

    public static void main(String[] args) {
        Shape blueRectangle = new Rectangle(new Blue());
        blueRectangle.draw();

        Shape greenSquare = new Square(new Green());
        greenSquare.draw();

        Shape redTriangle = new Triangle(new Red());
        redTriangle.draw();
    }
}
