package src.main.java;

public class SierpinskiCarpet {

   public static void main(String[] args) {
        drawSierpinskiCarpet(3, 27);
    }
    
    public static void drawSierpinskiCarpet(int order, int size) {
        SierpinkskiCarpetImpl carpet = new SierpinkskiCarpetImpl(order, size);
        carpet.generate();
    }
}
