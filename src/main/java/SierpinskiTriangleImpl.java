package src.main.java;

import static src.main.java.ArrayUtils.SPACE;
import static src.main.java.ArrayUtils.STAR;

public class SierpinskiTriangleImpl {

    private final char[][] startArray;
    private int order;

    public SierpinskiTriangleImpl(int order) {
        this.order = order;
        startArray = new char[2][2];
        ArrayUtils.fillArray(startArray, STAR);
        startArray[0][1] = SPACE;
    }

    public void generate() {
        char[][] newArray = startArray;
        for (int i = 1; i < order; i++) {
            newArray = expandArray(newArray);
        }
        new ArrayDrawer().drawArray(newArray);
    }

    private char[][] expandArray(char[][] newArray) {
        char[][] nextArray = new char[newArray.length * 2][newArray.length * 2];
        ArrayUtils.fillArray(nextArray, SPACE);
        for (int rowNum = newArray.length; rowNum < newArray.length * 2; rowNum++) {
            for (int columnNum = 0; columnNum < newArray.length; columnNum++) {
                nextArray[rowNum][columnNum] = newArray[rowNum - newArray.length][columnNum];
            }
        }
        for (int rowNum = newArray.length; rowNum < newArray.length * 2; rowNum++) {
            for (int columnNum = newArray.length; columnNum < newArray.length * 2; columnNum++) {
                nextArray[rowNum][columnNum] = newArray[rowNum - newArray.length][columnNum - newArray.length];
            }
        }
        for (int rowNum = 0; rowNum < newArray.length; rowNum++) {
            for (int columnNum = newArray.length / 2; columnNum < newArray.length + newArray.length / 2; columnNum++) {
                nextArray[rowNum][columnNum] = newArray[rowNum][columnNum - newArray.length / 2];
            }
        }
        return nextArray;
    }
}
