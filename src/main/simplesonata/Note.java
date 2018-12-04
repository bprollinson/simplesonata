package simplesonata;

public class Note
{
    private double frequencyHz;
    private int timeS;

    public Note(double frequencyHz, int timeS)
    {
        this.frequencyHz = frequencyHz;
        this.timeS = timeS;
    }

    public double getFrequencyHz()
    {
        return this.frequencyHz;
    }
}
