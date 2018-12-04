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
            double period = samplePointsPerSecond / note.getFrequencyHZ();
            double angle = 2.0 * Math.PI * i / period;
            samplePoints[i] = (byte)(Math.round(Math.sin(angle) * 127f));
        }
        MusicSampleNote sampleNote = new MusicSampleNote(samplePoints);
        MusicSample sample = new MusicSample(new MusicSampleNote[] {
            sampleNote
        });

        return sample;
    }
}
