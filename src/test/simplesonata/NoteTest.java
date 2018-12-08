package simplesonata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NoteTest
{
    @Test
    public void testConstructorSetsFrequencyFromLetterAndOctaveForA4()
    {
        Note note = new Note('A', 4, 1);

        assertEquals(440, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromLetterAndHigherOctave()
    {
        Note note = new Note('A', 5, 1);

        assertEquals(880, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromLetterAndLowerOctave()
    {
        Note note = new Note('A', 3, 1);

        assertEquals(220, note.getFrequencyHz(), 0.01);
    }
}
