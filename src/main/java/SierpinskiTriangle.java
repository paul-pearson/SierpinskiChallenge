package src.main.java;

public class SierpinskiTriangle {
    public static void main(String[] args) {
        drawTriangle(20);

        drawSierpinskiTriangle(3);
    }
    public static void drawTriangle(int height){
        SimpleTriangle triangle = new SimpleTriangle(height);
        triangle.generate();
    };
    
    public static void drawSierpinskiTriangle(int order) {
         SierpinskiTriangleImpl trianglePart3 = new SierpinskiTriangleImpl(order);
         trianglePart3.generate();
    }
}
