import com.mukesh.calculator.BasicCalculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorSubtractionTest {

    @Test
    public void subtractTowWholeNumbers() {
        BasicCalculator baseCalculator = new BasicCalculator();
        int a =10;
        int b=20;
        int result = baseCalculator.subtractNumbers(a, b);
        Assert.assertEquals(-10, result);
    }

}
