package simplesonata;

public class NoteSequenceSampler
{
    private static final int SAMPLE_TIME_SECONDS = 2;

    public MusicSample sample(NoteSequence sequence, int samplePointsPerSecond)
    {
        byte[] samplePoints = new byte[samplePointsPerSecond * NoteSequenceSampler.SAMPLE_TIME_SECONDS];
        MusicSample sample = new MusicSample(samplePoints);

        return sample;
    }
}
