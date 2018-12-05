package simplesonata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class MusicSampleTest
{
    @Test
    public void testEqualsReturnsTrueWhenSamplePointsAreTheSame()
    {
        MusicSample sample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                1,
                2
            }, 0)
        });
        MusicSample otherSample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                1,
                2
            }, 0)
        });

        assertEquals(otherSample, sample);
    }

    @Test
    public void testEqualsReturnsTrueForMultiNoteSample()
    {
        MusicSample sample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                1,
                2
            }, 0),
            new MusicSampleNote(new byte[] {
                3,
                4
            }, 0)
        });
        MusicSample otherSample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                1,
                2
            }, 0),
            new MusicSampleNote(new byte[] {
                3,
                4
            }, 0)
        });

        assertEquals(otherSample, sample);
    }

    @Test
    public void testEqualsReturnsFalseWhenSamplePointsAreDifferent()
    {
        MusicSample sample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                1,
                2
            }, 0)
        });
        MusicSample otherSample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                1,
                3
            }, 0)
        });

        assertNotEquals(otherSample, sample);
    }

    @Test
    public void testEqualsReturnsFalseWhenNumberOfNotesIsDifferent()
    {
        MusicSample sample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                1,
                2
            }, 0),
            new MusicSampleNote(new byte[] {
                3,
                4
            }, 0)
        });
        MusicSample otherSample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                1,
                2
            }, 0)
        });

        assertNotEquals(otherSample, sample);
    }

    @Test
    public void testEqualsReturnsFalseForObjectWithDifferentClass()
    {
        MusicSample sample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                1,
                2
            }, 0)
        });

        assertNotEquals(new Object(), sample);
    }
}
