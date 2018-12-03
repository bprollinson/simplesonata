package simplesonata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NoteSequenceSamplerTest
{
    @Test
    public void testSampleReturnsMinimalSample()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(1, 1));

        MusicSample expectedSample = new MusicSample(new byte[] {
            0,
            0
        });

        assertEquals(expectedSample, sampler.sample(sequence, 1));
    }

    @Test
    public void testSampleReturnsSampleWithMinAndMaxPoints()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(1, 1));

        MusicSample expectedSample = new MusicSample(new byte[] {
            0,
            127,
            0,
            -127,
            0,
            127,
            0,
            -127
        });

        assertEquals(expectedSample, sampler.sample(sequence, 4));
    }

    @Test
    public void testSampleReturnsSampleWithIntermediatePoints()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(1, 1));

        MusicSample expectedSample = new MusicSample(new byte[] {
            0,
            90,
            127,
            90,
            0,
            -90,
            -127,
            -90,
            0,
            90,
            127,
            90,
            0,
            -90,
            -127,
            -90
        });

        assertEquals(expectedSample, sampler.sample(sequence, 8));
    }
}
