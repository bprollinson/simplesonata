package simplesonata;

import javax.sound.sampled.LineUnavailableException;

public class LetterChromaticScaleSample implements Sample
{
    public void play() throws LineUnavailableException, InvalidNoteDescriptorException
    {
        NoteSequence noteSequence = new NoteSequence(
            60,
            new Note("C", 5, 0.5),
            new Note("C#", 5, 0.5),
            new Note("D", 5, 0.5),
            new Note("D#", 5, 0.5),
            new Note("E", 5, 0.5),
            new Note("F", 5, 0.5),
            new Note("F#", 5, 0.5),
            new Note("G", 5, 0.5),
            new Note("G#", 5, 0.5),
            new Note("A", 5, 0.5),
            new Note("A#", 5, 0.5),
            new Note("B", 5, 0.5),
            new Note("C", 6, 0.5)
        );
        NoteSequenceSampler sampler = new NoteSequenceSampler();

        MusicSample sample = sampler.sample(noteSequence, 16 * 1024);
        MusicSamplePlayer player = new MusicSamplePlayer();
        player.play(sample, 16 * 1024);
    }

    public static void main(String[] args) throws LineUnavailableException, InvalidNoteDescriptorException
    {
        new LetterChromaticScaleSample().play();
    }
}
