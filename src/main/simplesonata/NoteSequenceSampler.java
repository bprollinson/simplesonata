package simplesonata;

public class NoteSequenceSampler
{
    private static final int SAMPLE_TIME_S = 2;

    public MusicSample sample(NoteSequence sequence, int samplePointsPerSecond)
    {
        Note note = sequence.getNote(0);
        byte[] samplePoints = this.calculateWaveSampleValues(note, samplePointsPerSecond);

        MusicSampleNote sampleNote = new MusicSampleNote(samplePoints);
        MusicSample sample = new MusicSample(new MusicSampleNote[] {
            sampleNote
        });

        return sample;
    }

    private byte[] calculateWaveSampleValues(Note note, int samplePointsPerSecond)
    {
        byte[] sampleValues = new byte[samplePointsPerSecond * NoteSequenceSampler.SAMPLE_TIME_S];

        for (int timeIndex = 0; timeIndex < sampleValues.length; timeIndex++)
        {
            sampleValues[timeIndex] = this.calculateWaveSampleValue(note, samplePointsPerSecond, timeIndex);
        }

        return sampleValues;
    }

    private byte calculateWaveSampleValue(Note note, int samplePointsPerSecond, int timeIndex)
    {
        double period = samplePointsPerSecond / note.getFrequencyHz();
        double angle = 2.0 * Math.PI * timeIndex / period;

        return (byte)(Math.round(Math.sin(angle) * 127));
    }
}
