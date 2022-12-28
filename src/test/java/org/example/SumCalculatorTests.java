package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {

    private SumCalculator sumCalculator;
    @BeforeEach
    public void initEach(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public void testThat1InputHandledCorrectly() throws InterruptedException {
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }
    @Test
    public void testThat6InputHandledCorrectly() throws InterruptedException {
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }
    @Test
    public void testThat0InputHandledCorrectly() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> sumCalculator.sum(0)
        );
    }
}
