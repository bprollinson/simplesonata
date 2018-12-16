package simplesonata;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.FloatControl;
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
        double maxVolumeToStandardVolumeRatio = this.calculateMaxVolumeToStandardVolumeRatio(dataLine);
        for (int i = 0; i < sampleNotes.length; i++) {
            this.play(dataLine, sampleNotes[i], (int)Math.round(1000 * sampleNotes[i].getDurationInSeconds()), samplePointsPerSecond, maxVolumeToStandardVolumeRatio);
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

    private double calculateMaxVolumeToStandardVolumeRatio(SourceDataLine dataLine)
    {
        FloatControl volumeControl = (FloatControl)dataLine.getControl(FloatControl.Type.MASTER_GAIN);
        float maxVolumeDB = volumeControl.getMaximum();
        double maxVolume = 100 * Math.pow(10.0d, maxVolumeDB / 20.0d);
        double standardVolumeDB = 20d * Math.log(1d) / Math.log(10d);
        double standardVolume = 100 * Math.pow(1d, standardVolumeDB / 20.0d);

        return maxVolume / standardVolume;
    }

    private void play(SourceDataLine dataLine, MusicSampleNote sampleNote, int timeMs, int samplePointsPerSecond, double maxVolumeToStandardVolumeRatio)
    {
        this.setDataLineVolumeFromNote(dataLine, sampleNote, maxVolumeToStandardVolumeRatio);

        int bufferLength = samplePointsPerSecond * timeMs / 1000;
        int count = dataLine.write(sampleNote.getSamplePoints(), 0, bufferLength);
    }

    private void setDataLineVolumeFromNote(SourceDataLine dataLine, MusicSampleNote sampleNote, double maxVolumeToStandardVolumeRatio)
    {
        FloatControl volumeControl = (FloatControl)dataLine.getControl(FloatControl.Type.MASTER_GAIN);
        double volumeDB = 20d * Math.log(sampleNote.getVolume() / 100d * maxVolumeToStandardVolumeRatio) / Math.log(10d);

        volumeControl.setValue((float)volumeDB);
    }

    private void closeDataLine(SourceDataLine dataLine)
    {
        dataLine.drain();
        dataLine.close();
    }
}
