package src.main.test;

import org.junit.jupiter.api.Test;
import src.main.java.SimpleTriangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTriangleTest {

    private SimpleTriangle setUpTriangle (int size){
        SimpleTriangle triangle = new SimpleTriangle(size);
        triangle.generate();
        return triangle;
    }

    @Test
    public void testEvenSizeTriangle () {
        char[][] array = setUpTriangle(4).getArray();
        assertEquals ("   *   ", String.valueOf(array[0]));
        assertEquals ("  * *  ", String.valueOf(array[1]));
        assertEquals("*******", String.valueOf(array[3]));
        assertEquals(4, array.length);
    }

    @Test
    public void testOddSizeTriangle () {
        char[][] array = setUpTriangle(5).getArray();
        assertEquals ("    *    ", String.valueOf(array[0]));
        assertEquals ("   * *   ", String.valueOf(array[1]));
        assertEquals("*********", String.valueOf(array[4]));
        assertEquals(5, array.length);
    }

    @Test
    public void testEdgeCaseSize1 () {
        char[][] array = setUpTriangle(1).getArray();
        assertEquals("*",String.valueOf(array[0]));
        assertEquals(1, array.length);
    }
}