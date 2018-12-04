package simplesonata;

import java.util.Arrays;

public class MusicSampleNote
{
    private byte[] samplePoints;

    public MusicSampleNote(byte[] samplePoints)
    {
        this.samplePoints = samplePoints;
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
