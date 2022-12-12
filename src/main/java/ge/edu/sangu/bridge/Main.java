package ge.edu.sangu.bridge;

import ge.edu.sangu.bridge.implementations.Blue;
import ge.edu.sangu.bridge.implementations.Green;
import ge.edu.sangu.bridge.implementations.Rectangle;
import ge.edu.sangu.bridge.implementations.Red;
import ge.edu.sangu.bridge.implementations.Square;
import ge.edu.sangu.bridge.implementations.Triangle;
import ge.edu.sangu.bridge.interfaces.Shape;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Shape blueRectangle = new Rectangle(new Blue());
        blueRectangle.draw();

        Shape greenSquare = new Square(new Green());
        greenSquare.draw();

        Shape redTriangle = new Triangle(new Red());
        redTriangle.draw();

        IntStream.range(0, 12)
                .forEach(number -> {
                    Shape shape = null;
                    if (number % 3 == 0) {
                        shape = new Rectangle(new Blue());
                    }

                    if (number % 3 == 1) {
                        shape = new Triangle(new Green());
                    }

                    if (number % 3 == 2) {
                        shape = new Square(new Red());
                    }
                    shape.draw();
                });
    }
}
