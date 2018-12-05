package simplesonata;

import java.util.Arrays;

public class MusicSampleNote
{
    private byte[] samplePoints;
    private int timeS;

    public MusicSampleNote(byte[] samplePoints, int timeS)
    {
        this.samplePoints = samplePoints;
        this.timeS = timeS;
    }

    public byte[] getSamplePoints()
    {
        return this.samplePoints;
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof MusicSampleNote))
        {
            return false;
        }

        return Arrays.equals(this.samplePoints, ((MusicSampleNote)other).getSamplePoints());
    }
}
