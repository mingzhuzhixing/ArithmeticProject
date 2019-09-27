package com.v.arithmetic;

import com.v.arithmetic.array.FindArrayNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void arrayTest() {
        int[] array = new int[]{5, 3, 8, 9, 1, 4,};
//        int[] array = new int[]{9, 8, 1, 4, 5};
        FindArrayNumber.findSecondBig(array);

        FindArrayNumber.findSecondSmall(array);
    }
}