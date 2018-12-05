package simplesonata;

public class NoteSequenceSampler
{
    private static final int SAMPLE_TIME_S = 2;

    public MusicSample sample(NoteSequence sequence, int samplePointsPerSecond)
    {
        Note[] notes = sequence.getNotes();
        MusicSampleNote[] sampleNotes = new MusicSampleNote[notes.length];

        for (int i = 0; i < notes.length; i++)
        {
            byte[] samplePoints = this.calculateWaveSampleValues(notes[i], samplePointsPerSecond);
            sampleNotes[i] = new MusicSampleNote(samplePoints, 0);
        }

        return new MusicSample(sampleNotes);
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
