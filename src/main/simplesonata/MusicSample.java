package simplesonata;

import java.util.Arrays;

public class MusicSample
{
    private byte[] samplePoints;

    public MusicSample(byte[] samplePoints)
    {
        this.samplePoints = samplePoints;
    }

    public byte[] getSamplePoints()
    {
        return this.samplePoints;
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof MusicSample))
        {
            return false;
        }

        return Arrays.equals(this.samplePoints, ((MusicSample)other).getSamplePoints());
    }
}
