package simplesonata;

public class Note
{
    private double frequencyHZ;
    private int timeS;

    public Note(double frequencyHZ, int timeS)
    {
        this.frequencyHZ = frequencyHZ;
        this.timeS = timeS;
    }

    public double getFrequencyHZ()
    {
        return this.frequencyHZ;
    }
}
