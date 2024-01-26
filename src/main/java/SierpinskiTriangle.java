package src.main.java;

public class SierpinskiTriangle {
    public static void main(String[] args) {
        drawTriangle(20);

        drawSierpinskiTriangle(3);
    }
    public static void drawTriangle(int height){
        Triangle triangle = new Triangle(height);
        triangle.generate();
    };
    
    public static void drawSierpinskiTriangle(int order) {
     //TODO: Implement this   
    }
}
