package simplesonata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class MusicSampleTest
{
    @Test
    public void testEqualsReturnsTrueWhenSamplePointsAreTheSame()
    {
        MusicSample sample = new MusicSample(new byte[] {
            1,
            2
        });
        MusicSample otherSample = new MusicSample(new byte[] {
            1,
            2
        });

        assertEquals(otherSample, sample);
    }

    @Test
    public void testEqualsReturnsFalseWhenSamplePointsAreNotTheSame()
    {
        MusicSample sample = new MusicSample(new byte[] {
            1,
            2
        });
        MusicSample otherSample = new MusicSample(new byte[] {
            1,
            3
        });

        assertNotEquals(otherSample, sample);
    }

    @Test
    public void testEqualsReturnsFalseForObjectWithDifferentClass()
    {
        MusicSample sample = new MusicSample(new byte[] {
            1,
            2
        });

        assertNotEquals(new Object(), sample);
    }
}
