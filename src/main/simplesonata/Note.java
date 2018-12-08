package simplesonata;

public class Note
{
    private static final double A4_FREQUENCY = 440;
    private static final int A4_OCTAVE = 4;

    private double frequencyHz;
    private double durationS;

    public Note(double frequencyHz, double durationS)
    {
        this.frequencyHz = frequencyHz;
        this.durationS = durationS;
    }

    public Note(char noteLetter, int octave, double durationS)
    {
        this.frequencyHz = Note.A4_FREQUENCY * Math.pow(2, (octave - Note.A4_OCTAVE));
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
