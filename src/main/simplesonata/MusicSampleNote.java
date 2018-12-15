package simplesonata;

import java.util.Arrays;

public class MusicSampleNote
{
    private static final double DEFAULT_VOLUME = 100;

    private byte[] samplePoints;
    private double durationS;
    private double volume;

    public MusicSampleNote(byte[] samplePoints, double durationS)
    {
        this(samplePoints, durationS, MusicSampleNote.DEFAULT_VOLUME);
    }

    public MusicSampleNote(byte[] samplePoints, double durationS, double volume)
    {
        this.samplePoints = samplePoints;
        this.durationS = durationS;
        this.volume = volume;
    }

    public byte[] getSamplePoints()
    {
        return this.samplePoints;
    }

    public double getDurationInSeconds()
    {
        return this.durationS;
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof MusicSampleNote))
        {
            return false;
        }

        MusicSampleNote otherSampleNote = (MusicSampleNote)other;

        return Arrays.equals(this.samplePoints, otherSampleNote.getSamplePoints()) && this.durationS == otherSampleNote.getDurationInSeconds();
    }
}
