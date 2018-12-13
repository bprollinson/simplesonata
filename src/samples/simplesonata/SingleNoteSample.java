package simplesonata;

import javax.sound.sampled.LineUnavailableException;

public class SingleNoteSample implements Sample
{
    public void play() throws LineUnavailableException
    {
        NoteSequence noteSequence = new NoteSequence(
            60,
            new Note(440, 1)
        );
        NoteSequenceSampler sampler = new NoteSequenceSampler();

        MusicSample sample = sampler.sample(noteSequence, 16 * 1024);
        MusicSamplePlayer player = new MusicSamplePlayer();
        player.play(sample, 16 * 1024);
    }

    public static void main(String[] args) throws LineUnavailableException
    {
        new SingleNoteSample().play();
    }
}
