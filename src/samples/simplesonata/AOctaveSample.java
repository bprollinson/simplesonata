package simplesonata;

import javax.sound.sampled.LineUnavailableException;

public class AOctaveSample implements Sample
{
    public void play() throws LineUnavailableException, InvalidNoteDescriptorException
    {
        NoteSequence noteSequence = new NoteSequence(
            new Note("A", 4, 1),
            new Note("A", 5, 0.5),
            new Note("A", 3, 0.5)
        );
        NoteSequenceSampler sampler = new NoteSequenceSampler();

        MusicSample sample = sampler.sample(noteSequence, 16 * 1024);
        MusicSamplePlayer player = new MusicSamplePlayer();
        player.play(sample, 16 * 1024);
    }

    public static void main(String[] args) throws LineUnavailableException, InvalidNoteDescriptorException
    {
        new AOctaveSample().play();
    }
}
