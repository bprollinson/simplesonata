package simplesonata;

import org.junit.Test;

public class NoteSequenceSamplerTest
{
    @Test
    public void testSampleReturnsSingleStartingPoint()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(440, 1));
        MusicSample sample = sampler.sample(sequence, 1);

        throw new RuntimeException();
    }
}