package simplesonata;

import javax.sound.sampled.LineUnavailableException;

public class MultiNoteAndDurationSample implements Sample
{
    public void play() throws LineUnavailableException
    {
        NoteSequence noteSequence = new NoteSequence(new Note(440, 1), new Note(880, 2));
        NoteSequenceSampler sampler = new NoteSequenceSampler();

        MusicSample sample = sampler.sample(noteSequence, 16 * 1024);
        MusicSamplePlayer player = new MusicSamplePlayer();
        player.play(sample, 16 * 1024);
    }

    public static void main(String[] args) throws LineUnavailableException
    {
        new MultiNoteAndDurationSample().play();
    }
}
