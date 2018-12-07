package simplesonata;

import java.util.Arrays;

public class MusicSampleNote
{
    private byte[] samplePoints;
    private double durationS;

    public MusicSampleNote(byte[] samplePoints, double durationS)
    {
        this.samplePoints = samplePoints;
        this.durationS = durationS;
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
