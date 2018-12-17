package simplesonata;

public class VolumeCalculator
{
    public double calculateMaxVolumeToStandardVolumeRatio(double maxVolumeDB)
    {
        return Math.pow(10.0d, maxVolumeDB / 20.0d);
    }
}
