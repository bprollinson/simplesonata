package simplesonata;

public class Note
{
    private double frequencyHz;
    private int durationS;

    public Note(double frequencyHz, int durationS)
    {
        this.frequencyHz = frequencyHz;
        this.durationS = durationS;
    }

    public double getFrequencyHz()
    {
        return this.frequencyHz;
    }
}
