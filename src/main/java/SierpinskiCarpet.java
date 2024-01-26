package src.main.java;

public class SierpinskiCarpet {

   public static void main(String[] args) {
        drawSierpinskiCarpet(3, 27);
    }
    
    public static void drawSierpinskiCarpet(int order, int size) {
        Carpet carpet = new Carpet(order, size);
        carpet.generate();
    }
}
