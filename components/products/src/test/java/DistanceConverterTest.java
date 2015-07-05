import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by nataliekerby on 7/5/15.
 */
public class DistanceConverterTest extends TestCase {

    private final double FIVE_KILOMETERS = 5.0;
    private final double TEN_KILOMETERS = 10.0;
    private final double HALF_MARATHON = 13.1;
    private final double FULL_MARATHON = 26.2;
    private final DistanceConverter CONVERTER = new DistanceConverter();

    public void testConvertKilometersToMiles(){
        double fiveK = CONVERTER.convertKilometersToMiles(FIVE_KILOMETERS);
        Assert.assertEquals(3.1, fiveK, 0.01);

        double tenK = CONVERTER.convertKilometersToMiles(TEN_KILOMETERS);
        Assert.assertEquals(6.2, tenK, 0.01);
    }
}