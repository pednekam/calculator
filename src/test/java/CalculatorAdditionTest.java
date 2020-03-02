import com.mukesh.calculator.BasicCalculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorAdditionTest {
    @Test
    public void addingTwoWholeNumbers () throws Exception {
        BasicCalculator baseCalculator = new BasicCalculator();
        int a =10;
        int b=20;
        int result = baseCalculator.addNumbers(a, b);
        Assert.assertEquals(30, result);
    }

    @Test
    public void addingTwoNegativeNumbers () throws Exception {
        BasicCalculator baseCalculator = new BasicCalculator();
        int a = -30;
        int b= -20;
        int result = baseCalculator.addNumbers(a, b);
        Assert.assertEquals(-50, result);
    }

    @Test
    public void addingOnePositiveAndOneNegativeNumber () throws Exception {
        BasicCalculator baseCalculator = new BasicCalculator();
        int a =-10;
        int b=20;
        int result = baseCalculator.addNumbers(a, b);
        Assert.assertEquals(10, result);
    }

    @Test
    public void addingTwoDecimalNumbers () throws Exception {
        BasicCalculator baseCalculator = new BasicCalculator();
        double a =10.20;
        double b=20.22;
        long result = Math.round(baseCalculator.addNumbers(a, b)) ;
        Assert.assertEquals(result, 30);
    }
}
