import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenQuantityInFeet_ShouldReturnQuantityInInches() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double numberInFeet = 5.0;
        double convertedQuantity = quantityMeasurement.unitConverter(numberInFeet);
        Assert.assertEquals(60.0,convertedQuantity,0.0);
    }
}
