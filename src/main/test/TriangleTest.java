package src.main.test;

import org.junit.jupiter.api.Test;
import src.main.java.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    private Triangle setUpTriangle (int size){
        Triangle triangle = new Triangle(size);
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