package src.main.java;

public class Carpet {


    private char STAR = '*';
    private char SPACE = ' ';

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
        int currentOrder = 1;
        int squareRow = 0;
        int squareColumn = 0;
        int squareSize = size;
        doRecursion(currentOrder, squareRow, squareColumn, squareSize);
        new ArrayDrawer().drawArray(array);
    }

    private void doRecursion(int currentOrder, int squareRow, int squareColumn, int squareSize) {
        if (currentOrder <= order) {
            int startRow = squareSize / 3 + squareRow;
            int startColumn = squareSize / 3 + squareColumn;
            int endRow = startRow + squareSize / 3;
            int endColumn = startColumn + squareSize / 3;
            removeSquares(startRow, endRow, startColumn, endColumn);
            doRecursion(currentOrder + 1, squareRow, squareColumn, squareSize / 3);
            doRecursion(currentOrder + 1, squareRow, squareColumn + squareSize / 3, squareSize / 3);
            doRecursion(currentOrder + 1, squareRow, squareColumn + 2 * squareSize / 3, squareSize / 3);
            doRecursion(currentOrder + 1, squareRow + squareSize / 3, squareColumn, squareSize / 3);
            doRecursion(currentOrder + 1, squareRow + squareSize / 3, squareColumn + 2 * squareSize / 3, squareSize / 3);
            doRecursion(currentOrder + 1, squareRow + 2 * squareSize / 3, squareColumn, squareSize / 3);
            doRecursion(currentOrder + 1, squareRow + 2 * squareSize / 3, squareColumn + squareSize / 3, squareSize / 3);
            doRecursion(currentOrder + 1, squareRow + 2 * squareSize / 3, squareColumn + 2 * squareSize / 3, squareSize / 3);
        }

    }

    private void removeSquares(int startRow, int endRow, int startColumn, int endColumn) {
        for (int rowNum = startRow; rowNum < endRow; rowNum++) {
            char[] row = array[rowNum];
            for (int columnNum = startColumn; columnNum < endColumn; columnNum++) {
                row[columnNum] = SPACE;
            }
        }
    }

    public char[][] getArray() {
        return array;
    }
}
