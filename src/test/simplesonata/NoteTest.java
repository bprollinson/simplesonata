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

    @Test
    public void testConstructorSetsFrequencyFromB()
    {
        Note note = new Note('B', 3, 1);

        assertEquals(246.94, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromC()
    {
        Note note = new Note('C', 4, 1);

        assertEquals(261.63, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromG()
    {
        Note note = new Note('G', 4, 1);

        assertEquals(392.00, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromBInLowerOctave()
    {
        Note note = new Note('B', 2, 1);

        assertEquals(123.47, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromCInLowerOctave()
    {
        Note note = new Note('C', 3, 1);

        assertEquals(130.81, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromGInLowerOctave()
    {
        Note note = new Note('G', 3, 1);

        assertEquals(196, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromBInHigherOctave()
    {
        Note note = new Note('B', 4, 1);

        assertEquals(493.88, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromCInHigherOctave()
    {
        Note note = new Note('C', 5, 1);

        assertEquals(523.25, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromGInHigherOctave()
    {
        Note note = new Note('G', 5, 1);

        assertEquals(783.99, note.getFrequencyHz(), 0.01);
    }
}
