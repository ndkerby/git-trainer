import java.text.DecimalFormat;

/**
 * Created by nataliekerby on 7/5/15.
 */
public class DistanceConverter {

    private final double CONVERSION_RATE = 0.621371;
    private final DecimalFormat DEC_FORMAT = new DecimalFormat("###.#");

    public double convertKilometersToMiles(double kilometers){
        return Double.valueOf(DEC_FORMAT.format(kilometers * CONVERSION_RATE));
    }

    public double convertMilesToKilometers(double miles){
        return Double.valueOf(DEC_FORMAT.format(miles / CONVERSION_RATE));
    }
}
