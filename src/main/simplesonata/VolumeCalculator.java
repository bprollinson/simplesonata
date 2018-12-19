package simplesonata;

public class VolumeCalculator
{
    public double convertVolumeDecibelsToPercent(double volumeDB)
    {
        return 100d * Math.pow(10.0d, volumeDB / 20.0d);
    }

    public double convertVolumePercentToDecibels(double volumePercent)
    {
        return 20d * Math.log(volumePercent / 100d) / Math.log(10d);
    }
}
