package au.com.rainmore.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

class FindArraysTest {

    @Test
    void test_find_1() {
        int[] a1 = {4, 9, 3, 7, 8};
        int[] a2 = {3, 7};

        OptionalInt result = FindArrays.find(a1, a2);

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(2, result.getAsInt());
    }

    @Test
    void test_find_2() {
        int[] a1 = {4, 9, 3, 7, 8};
        int[] a2 = {4, 9, 3};

        OptionalInt result = FindArrays.find(a1, a2);

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(0, result.getAsInt());
    }

    @Test
    void test_find_3() {
        int[] a1 = {4, 9, 3, 7, 8};
        int[] a2 = {8};

        OptionalInt result = FindArrays.find(a1, a2);

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(4, result.getAsInt());
    }

    @Test
    void test_find_4() {
        int[] a2 = {4, 9, 3, 7, 8};
        int[] a1 = {8};

        OptionalInt result = FindArrays.find(a1, a2);

        Assertions.assertFalse(result.isPresent());
        Assertions.assertEquals(result, OptionalInt.empty());
    }

    @Test
    void test_find_5() {
        int[] a1 = {4, 9, 3, 7, 8};
        int[] a2 = {4, 9, 5};

        OptionalInt result = FindArrays.find(a1, a2);

        Assertions.assertFalse(result.isPresent());
        Assertions.assertEquals(result, OptionalInt.empty());
    }
}
