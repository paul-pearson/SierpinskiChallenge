package src.main.java;

public class ArrayDrawer {

    public void drawArray(char[][] array) {
        for (char[] row: array) {
            for (char character: row) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
