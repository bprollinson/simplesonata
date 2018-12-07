package simplesonata;

public class Note
{
    private double frequencyHz;
    private double durationS;

    public Note(double frequencyHz, double durationS)
    {
        this.frequencyHz = frequencyHz;
        this.durationS = durationS;
    }

    public double getFrequencyHz()
    {
        return this.frequencyHz;
    }

    public double getDurationInSeconds()
    {
        return this.durationS;
    }
}
