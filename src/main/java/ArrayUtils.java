package src.main.java;

public class ArrayUtils {

    private static char SPACE = ' ';

    public static void fillArray(char[][] array) {
        for (char[] row: array) {
            for (int i = 0; i < row.length; i++) {
                row[i] = SPACE;
            }
        }
    }

}
