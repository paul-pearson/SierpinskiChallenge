package src.main.java;

public class ArrayUtils {

    public static final char STAR = '*';
    public static final char SPACE = ' ';

    public static void fillArray(char[][] array, char character) {
        for (char[] row: array) {
            for (int i = 0; i < row.length; i++) {
                row[i] = character;
            }
        }
    }

}
