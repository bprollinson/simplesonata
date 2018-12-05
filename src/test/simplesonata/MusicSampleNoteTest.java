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
        }, 1);
        MusicSampleNote otherSampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        }, 1);

        assertEquals(otherSampleNote, sampleNote);
    }

    @Test
    public void testEqualsReturnsFalseWhenSamplePointsAreDifferent()
    {
        MusicSampleNote sampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        }, 1);
        MusicSampleNote otherSampleNote = new MusicSampleNote(new byte[] {
            1,
            3
        }, 1);

        assertNotEquals(otherSampleNote, sampleNote);
    }

    @Test
    public void testEqualsReturnsFalseWhenSamePointTimesAreDifferent()
    {
        MusicSampleNote sampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        }, 1);
        MusicSampleNote otherSampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        }, 2);

        assertNotEquals(otherSampleNote, sampleNote);
    }

    @Test
    public void testEqualsReturnsFalseForObjectWithDifferentClass()
    {
        MusicSampleNote sampleNote = new MusicSampleNote(new byte[] {
            1,
            2
        }, 1);

        assertNotEquals(new Object(), sampleNote);
    }
}
