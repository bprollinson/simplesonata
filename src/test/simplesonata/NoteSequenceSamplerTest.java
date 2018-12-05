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

        MusicSample expectedSample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                0,
                0
            }, 1)
        });

        assertEquals(expectedSample, sampler.sample(sequence, 1));
    }

    @Test
    public void testSampleReturnsSampleWithMinAndMaxPoints()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(1, 1));

        MusicSample expectedSample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                0,
                127,
                0,
                -127,
                0,
                127,
                0,
                -127
            }, 1)
        });

        assertEquals(expectedSample, sampler.sample(sequence, 4));
    }

    @Test
    public void testSampleReturnsSampleWithIntermediatePoints()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(1, 1));

        MusicSample expectedSample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
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
            }, 1)
        });

        assertEquals(expectedSample, sampler.sample(sequence, 8));
    }

    @Test
    public void testSampleReturnsSampleFromFractionalNoteFrequency()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(0.5, 1));

        MusicSample expectedSample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                0,
                90,
                127,
                90,
                0,
                -90,
                -127,
                -90
            }, 1)
        });

        assertEquals(expectedSample, sampler.sample(sequence, 4));
    }

    @Test
    public void testSampleReturnsSynchopatedSample()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(0.4, 1));

        MusicSample expectedSample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                0,
                75,
                121,
                121,
                75,
                0,
                -75,
                -121
            }, 1)
        });

        assertEquals(expectedSample, sampler.sample(sequence, 4));
    }

    @Test
    public void testSampleReturnsMultiNoteSample()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(1, 1), new Note(0.5, 1));

        MusicSample expectedSample = new MusicSample(new MusicSampleNote[] {
            new MusicSampleNote(new byte[] {
                0,
                127,
                0,
                -127,
                0,
                127,
                0,
                -127
            }, 1),
            new MusicSampleNote(new byte[] {
                0,
                90,
                127,
                90,
                0,
                -90,
                -127,
                -90
            }, 1)
        });

        assertEquals(expectedSample, sampler.sample(sequence, 4));
    }
}
