package simplesonata;

import java.util.Arrays;

public class MusicSample
{
    private MusicSampleNote[] sampleNotes;

    public MusicSample(MusicSampleNote[] sampleNotes)
    {
        this.sampleNotes = sampleNotes;
    }

    public MusicSampleNote[] getSampleNotes()
    {
        return this.sampleNotes;
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof MusicSample))
        {
            return false;
        }

        return Arrays.equals(this.sampleNotes, ((MusicSample)other).getSampleNotes());
    }
}
