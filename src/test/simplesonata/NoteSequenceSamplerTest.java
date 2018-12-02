package simplesonata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NoteSequenceSamplerTest
{
    @Test
    public void testSampleReturnsMinimalSample()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(440, 1));

        MusicSample expectedSample = new MusicSample(new byte[] {
            0,
            0
        });

        assertEquals(expectedSample, sampler.sample(sequence, 1));
    }
}
