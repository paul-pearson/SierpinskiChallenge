package src.main.java;

import static src.main.java.ArrayUtils.SPACE;
import static src.main.java.ArrayUtils.STAR;


public class SimpleTriangle {

    private final char[][] array;
    private int height;

    public SimpleTriangle(int height) {
        this.height = height;
        array = new char[height][(2 * height) - 1];
        ArrayUtils.fillArray(array, SPACE);
    }

    public void generate () {
        int middlePosition = height - 1;
        array[0][middlePosition] = STAR;
        int diff = 1;
        for (int row = 1; row < array.length - 1; row++){
            array[row][middlePosition - diff] = STAR;
            array[row][middlePosition + diff] = STAR;
            diff++;
        }
        for (int column = 0; column < height * 2 - 1; column++) {
            array[array.length - 1][column] = STAR;
        }
        new ArrayDrawer().drawArray(array);
    }

    public char[][] getArray() {
        return array;
    }
}
