import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {

    public SumCalculator initEach() {
        return new SumCalculator();
    }
    @Test
    public void testThat1InputHandledCorrectly() {
        Assertions.assertEquals(1, initEach().sum(1));
    }
    @Test
    public void testThat6InputHandledCorrectly() {
        Assertions.assertEquals(6, initEach().sum(3));
    }
    @Test
    public void testThat0InputHandledCorrectly() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> initEach().sum(0)
        );
    }
}