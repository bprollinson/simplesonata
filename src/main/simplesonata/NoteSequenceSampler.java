package simplesonata;

public class NoteSequenceSampler
{
    private static final int SAMPLE_TIME_SECONDS = 2;

    public MusicSample sample(NoteSequence sequence, int samplePointsPerSecond)
    {
        byte[] samplePoints = new byte[samplePointsPerSecond * NoteSequenceSampler.SAMPLE_TIME_SECONDS];

        Note note = sequence.getNote(0);

        for (int i = 0; i < samplePoints.length; i++)
        {
            double period = (double)samplePointsPerSecond / note.getFrequencyHZ();
            double angle = 2.0 * Math.PI * i / period;
            samplePoints[i] = (byte)(Math.sin(angle) * 127f);
        }
        MusicSample sample = new MusicSample(samplePoints);

        return sample;
    }
}
