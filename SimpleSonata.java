import simplesonata.MusicSample;
import simplesonata.MusicSamplePlayer;
import simplesonata.Note;
import simplesonata.NoteSequence;
import simplesonata.NoteSequenceSampler;

public class SimpleSonata
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("There");

        NoteSequence noteSequence = new NoteSequence(new Note(640, 1), new Note(660, 2));
        NoteSequenceSampler sampler = new NoteSequenceSampler();

        MusicSample sample = sampler.sample(noteSequence, 16 * 1024);
        MusicSamplePlayer player = new MusicSamplePlayer();
        player.play(sample, 16 * 1024);
    }
}
