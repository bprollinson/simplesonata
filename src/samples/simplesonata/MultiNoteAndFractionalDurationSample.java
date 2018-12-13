package simplesonata;

import javax.sound.sampled.LineUnavailableException;

public class MultiNoteAndFractionalDurationSample implements Sample
{
    public void play() throws LineUnavailableException
    {
        NoteSequence noteSequence = new NoteSequence(
            60,
            new Note(440, 1),
            new Note(880, 0.5),
            new Note(440, 0.5)
        );
        NoteSequenceSampler sampler = new NoteSequenceSampler();

        MusicSample sample = sampler.sample(noteSequence, 16 * 1024);
        MusicSamplePlayer player = new MusicSamplePlayer();
        player.play(sample, 16 * 1024);
    }

    public static void main(String[] args) throws LineUnavailableException
    {
        new MultiNoteAndFractionalDurationSample().play();
    }
}
