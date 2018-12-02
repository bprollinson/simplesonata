package simplesonata;

public class NoteSequenceSampler
{
    private static final int SAMPLE_TIME_SECONDS = 2;

    public MusicSample sample(NoteSequence sequence, int samplePointsPerSecond)
    {
        byte[] samplePoints = new byte[samplePointsPerSecond * NoteSequenceSampler.SAMPLE_TIME_SECONDS];
        for (int i = 0; i < samplePoints.length; i++)
        {
            samplePoints[i] = 0;
        }
        MusicSample sample = new MusicSample(samplePoints);

        return sample;
    }
}
