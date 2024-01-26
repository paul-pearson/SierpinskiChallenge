package src.main.java;

public class Carpet {


    private char STAR = '*';

    private final char[][] array;
    private int order;
    private int size;

    public Carpet(int order, int size) {
        this.order = order;
        this.size = size;
        array = new char[size][size];
        ArrayUtils.fillArray(array, STAR);
    }


    public void generate() {
        removeSquares(size / 3, 2  * size/ 3, size / 3, 2 * size / 3);
        new ArrayDrawer().drawArray(array);
    }

    private void removeSquares(int startRow, int endRow, int startColumn, int endColumn) {
        for (int row = startRow; row < endRow; row++) {

        }
    }
}
