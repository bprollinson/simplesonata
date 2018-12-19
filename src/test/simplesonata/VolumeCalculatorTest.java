package simplesonata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VolumeCalculatorTest
{
    @Test
    public void testConvertVolumeDecibelsToPercentReturns1000ForMaximumOf20()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(1000, calculator.convertVolumeDecibelsToPercent(20), 0.01);
    }

    @Test
    public void testConvertVolumeDecibelsToPercentReturns100ForMaximumOf0()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(100, calculator.convertVolumeDecibelsToPercent(0), 0.01);
    }

    @Test
    public void testConvertVolumeDecibelsToPercentReturnsFractionalRatioForMaximumLessThan0()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(31.62, calculator.convertVolumeDecibelsToPercent(-10), 0.01);
    }

    @Test
    public void testConvertVolumeDecibelsToPercentReturnsFractionalRatioForMaximumBetween0And20()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(316.23, calculator.convertVolumeDecibelsToPercent(10), 0.01);
    }

    @Test
    public void testConvertVolumeDecibelsToPercentReturnsFractionalRatioForMaximumGreaterThan20()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(3162.28, calculator.convertVolumeDecibelsToPercent(30), 0.01);
    }

    @Test
    public void testConvertVolumeDecibelsToPercentReturns200ForAppropriateMaximum()
    {
        VolumeCalculator calculator = new VolumeCalculator();
        double maxVolumeDB = 20 * Math.log(200 / 100) / Math.log(10);

        assertEquals(200, calculator.convertVolumeDecibelsToPercent(maxVolumeDB), 0.01);
    }

    @Test
    public void testConvertVolumePercentToDecibelsReturnsNegativeInfinityForVolumeOf0()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(Double.NEGATIVE_INFINITY, calculator.convertVolumePercentToDecibels(0), 0.01);
    }

    @Test
    public void testConvertVolumePercentToDecibalsReturnsFractionalValueForVolumeBetween0And100()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(-6.02, calculator.convertVolumePercentToDecibels(50), 0.01);
    }

    @Test
    public void testConvertVolumePercentToDecibelsReturns0ForVolumeOf100()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(0, calculator.convertVolumePercentToDecibels(100), 0.01);
    }

    @Test
    public void testConvertVolumePercentToDecibelsReturnsFractionalValueForVolumeGreaterThan100()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(3.52, calculator.convertVolumePercentToDecibels(150), 0.01);
    }
}
