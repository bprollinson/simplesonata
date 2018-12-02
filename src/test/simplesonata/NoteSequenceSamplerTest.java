package simplesonata;

public class NoteSequenceSamplerTest
{
    public void testSampleReturnsSingleStartingPoint()
    {
        NoteSequenceSampler sampler = new NoteSequenceSampler();
        NoteSequence sequence = new NoteSequence(new Note(440, 1));
        MusicSample sample = sampler.sample(sequence);

        throw new RuntimeException();
    }
}
