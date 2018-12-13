package simplesonata;

public class Rest extends Note
{
    private static final int SILENCE_FREQUENCY_HZ = 0;

    private double durationB;

    public Rest(double durationB)
    {
        super(Rest.SILENCE_FREQUENCY_HZ, durationB);
    }
}
