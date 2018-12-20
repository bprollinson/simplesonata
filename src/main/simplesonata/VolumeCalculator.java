package simplesonata;

public class VolumeCalculator
{
    public double convertVolumeDecibelsToPercent(double volumeDB)
    {
        return 100d * Math.pow(10d, volumeDB / 20d);
    }

    public double convertVolumePercentToDecibels(double volumePercent)
    {
        return 20d * Math.log(volumePercent / 100d) / Math.log(10d);
    }
}
