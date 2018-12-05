package simplesonata;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class MusicSamplePlayer
{
    public void play(MusicSample sample, int samplePointsPerSecond) throws LineUnavailableException
    {
        MusicSampleNote[] sampleNotes = sample.getSampleNotes();

        SourceDataLine dataLine = this.openDataLine(samplePointsPerSecond);
        for (int i = 0; i < sampleNotes.length; i++) {
            this.play(dataLine, sampleNotes[i], 500, samplePointsPerSecond);
        }

        this.closeDataLine(dataLine);
    }

    private SourceDataLine openDataLine(int samplePointsPerSecond) throws LineUnavailableException
    {
        AudioFormat audioFormat = new AudioFormat(samplePointsPerSecond, 8, 1, true, true);

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
