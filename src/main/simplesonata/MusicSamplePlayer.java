package simplesonata;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class MusicSamplePlayer
{
    private static final int SAMPLE_SIZE_BITS = 8;
    private static final int NUM_CHANNELS = 1;

    public void play(MusicSample sample, int samplePointsPerSecond) throws LineUnavailableException
    {
        MusicSampleNote[] sampleNotes = sample.getSampleNotes();

        SourceDataLine dataLine = this.openDataLine(samplePointsPerSecond);
        for (int i = 0; i < sampleNotes.length; i++) {
            this.play(dataLine, sampleNotes[i], (int)Math.round(1000 * sampleNotes[i].getDurationInSeconds()), samplePointsPerSecond);
        }

        this.closeDataLine(dataLine);
    }

    private SourceDataLine openDataLine(int samplePointsPerSecond) throws LineUnavailableException
    {
        AudioFormat audioFormat = new AudioFormat(samplePointsPerSecond, MusicSamplePlayer.SAMPLE_SIZE_BITS, MusicSamplePlayer.NUM_CHANNELS, true, true);

        SourceDataLine dataLine = AudioSystem.getSourceDataLine(audioFormat);
        dataLine.open(audioFormat, samplePointsPerSecond);
        dataLine.start();

        return dataLine;
    }

    private void closeDataLine(SourceDataLine dataLine)
    {
        dataLine.drain();
        dataLine.close();
    }

    private void play(SourceDataLine dataLine, MusicSampleNote sampleNote, int timeMs, int samplePointsPerSecond)
    {
        int bufferLength = samplePointsPerSecond * timeMs / 1000;
        int count = dataLine.write(sampleNote.getSamplePoints(), 0, bufferLength);
    }
}
