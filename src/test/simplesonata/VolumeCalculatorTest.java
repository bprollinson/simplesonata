package simplesonata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VolumeCalculatorTest
{
    @Test
    public void testCalculateMaxVolumeToStandardVolumeRatioReturns10ForMaximumOf20()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(10, calculator.calculateMaxVolumeToStandardVolumeRatio(20), 0.01);
    }

    @Test
    public void testCalculateMaxVolumeToStandardVolumeRatioReturns1ForMaximumOf0()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(1, calculator.calculateMaxVolumeToStandardVolumeRatio(0), 0.01);
    }

    @Test
    public void testCalculateVolumeToStandardVolumeRatioReturnsFractionalRatioForMaximumLessThan0()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(0.32, calculator.calculateMaxVolumeToStandardVolumeRatio(-10), 0.01);
    }

    @Test
    public void testCalculateVolumeToStandardVolumeRatioReturnsFractionalRatioForMaximumBetween0And20()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(3.16, calculator.calculateMaxVolumeToStandardVolumeRatio(10), 0.01);
    }

    @Test
    public void testCalculateVolumeToStandardVolumeRatioReturnsFractionalRatioForMaximumGreaterThan20()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        assertEquals(31.62, calculator.calculateMaxVolumeToStandardVolumeRatio(30), 0.01);
    }

    @Test
    public void testCalculateVolumeToStandardVolumeRatioReturns2ForAppropriateMaximum()
    {
        VolumeCalculator calculator = new VolumeCalculator();
        double maxVolumeDB = 20 * Math.log(200 / 100) / Math.log(10);

        assertEquals(2, calculator.calculateMaxVolumeToStandardVolumeRatio(maxVolumeDB), 0.01);
    }

    @Test
    public void testCalculateRealScaledVolumeInDecibels()
    {
        VolumeCalculator calculator = new VolumeCalculator();

        throw new RuntimeException();
    }
}
