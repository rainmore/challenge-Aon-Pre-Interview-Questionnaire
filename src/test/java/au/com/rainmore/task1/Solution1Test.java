package au.com.rainmore.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Solution1Test {

    @BeforeEach
    void setup() {

    }

    @Test
    void test_doIncrease() {
        MyIncDec incDec = new MyIncDec(0);
        Solution1 solution = new Solution1(incDec);
        Assertions.assertEquals(0, incDec.getX());
        solution.doIncrease();
        Assertions.assertEquals(1, incDec.getX());
    }

    @Test
    void test_doDecrement() {
        MyIncDec incDec = new MyIncDec(10);
        Solution1 solution = new Solution1(incDec);
        Assertions.assertEquals(10, incDec.getX());
        solution.doDecrement();
        Assertions.assertEquals(9, incDec.getX());
    }
}
