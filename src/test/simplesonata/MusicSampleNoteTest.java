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
        }, 0);
        MusicSampleNote otherSampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        }, 0);

        assertEquals(otherSampleNote, sampleNote);
    }

    @Test
    public void testEqualsReturnsFalseWhenSamplePointsAreDifferent()
    {
        MusicSampleNote sampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        }, 0);
        MusicSampleNote otherSampleNote = new MusicSampleNote(new byte[] {
            1,
            3
        }, 0);

        assertNotEquals(otherSampleNote, sampleNote);
    }

    @Test
    public void testEqualsReturnsFalseForObjectWithDifferentClass()
    {
        MusicSampleNote sampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        }, 0);

        assertNotEquals(new Object(), sampleNote);
    }
}
