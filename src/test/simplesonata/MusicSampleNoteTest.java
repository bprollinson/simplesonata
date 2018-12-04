package simplesonata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class MusicSampleNoteTest
{
    @Test
    public void testEqualsReturnsTrueWhenSamplePointsAreTheSame()
    {
        MusicSampleNote sampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        });
        MusicSampleNote otherSampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        });

        assertEquals(otherSampleNote, sampleNote);
    }

    @Test
    public void testEqualsReturnsFalseWhenSamplePointsAreDifferent()
    {
        MusicSampleNote sampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        });
        MusicSampleNote otherSampleNote = new MusicSampleNote(new byte[] {
            1,
            3
        });

        assertEquals(otherSampleNote, sampleNote);
    }
}
