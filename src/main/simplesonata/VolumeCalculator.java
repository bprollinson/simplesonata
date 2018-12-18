package simplesonata;

public class VolumeCalculator
{
    public double calculateMaxVolumeToStandardVolumeRatio(double maxVolumeDB)
    {
        return Math.pow(10.0d, maxVolumeDB / 20.0d);
    }

    public double convertVolumeToDecibels(double volume)
    {
        return 20d * Math.log(volume / 100d) / Math.log(10d);
    }
}
