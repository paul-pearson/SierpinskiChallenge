package src.main.java;

public class TrianglePart3 {

    private char STAR = '*';
    private char SPACE = ' ';

    private final char[][] startArray;
    private int order;

    public TrianglePart3 (int order) {
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
                nextArray[rowNum][columnNum] = newArray[rowNum - newArray.length][columnNum];
            }
        }
        return nextArray;
    }
}
