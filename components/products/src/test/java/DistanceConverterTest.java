import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by nataliekerby on 7/5/15.
 */
public class DistanceConverterTest extends TestCase {

    private final double FIVE_KILOMETERS = 5.0;
    private final double TEN_KILOMETERS = 10.0;
    private final double FIVE_K_MILES = 3.1;
    private final double TEN_K_MILES= 6.2;
    private final double HALF_MARATHON = 13.1;
    private final double FULL_MARATHON = 26.2;
    private final DistanceConverter CONVERTER = new DistanceConverter();

    public void testConvertKilometersToMiles(){
        double fiveK = CONVERTER.convertKilometersToMiles(FIVE_KILOMETERS);
        Assert.assertEquals(FIVE_K_MILES, fiveK, 0.01);

        double tenK = CONVERTER.convertKilometersToMiles(TEN_KILOMETERS);
        Assert.assertEquals(TEN_K_MILES, tenK, 0.01);
    }

    public void testConvertMilesToKilometers(){
        double fiveK = CONVERTER.convertMilesToKilometers(FIVE_K_MILES);
        Assert.assertEquals(FIVE_KILOMETERS, fiveK, 0.01);

        double tenK = CONVERTER.convertMilesToKilometers(TEN_K_MILES);
        Assert.assertEquals(TEN_KILOMETERS, tenK, 0.01);
    }
}