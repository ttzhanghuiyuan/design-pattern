package cn.yuan.test.structure.bridge;

public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle(new RedColor());
        circle.draw();

        Square square = new Square(new BlueColor());
        square.draw();
    }
}
