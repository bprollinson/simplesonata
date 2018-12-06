package simplesonata;

import java.util.Arrays;

public class MusicSampleNote
{
    private byte[] samplePoints;
    private int durationS;

    public MusicSampleNote(byte[] samplePoints, int durationS)
    {
        this.samplePoints = samplePoints;
        this.durationS = durationS;
    }

    public byte[] getSamplePoints()
    {
        return this.samplePoints;
    }

    public int getDurationInSeconds()
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
