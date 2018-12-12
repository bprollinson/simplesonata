package simplesonata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NoteTest
{
    @Test
    public void testConstructorSetsFrequencyFromLetterAndOctaveForA4() throws InvalidNoteDescriptorException
    {
        Note note = new Note("A", 4, 1);

        assertEquals(440, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromLetterAndHigherOctave() throws InvalidNoteDescriptorException
    {
        Note note = new Note("A", 5, 1);

        assertEquals(880, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromLetterAndLowerOctave() throws InvalidNoteDescriptorException
    {
        Note note = new Note("A", 3, 1);

        assertEquals(220, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromB() throws InvalidNoteDescriptorException
    {
        Note note = new Note("B", 3, 1);

        assertEquals(246.94, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromC() throws InvalidNoteDescriptorException
    {
        Note note = new Note("C", 4, 1);

        assertEquals(261.63, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromG() throws InvalidNoteDescriptorException
    {
        Note note = new Note("G", 4, 1);

        assertEquals(392.00, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromBInLowerOctave() throws InvalidNoteDescriptorException
    {
        Note note = new Note("B", 2, 1);

        assertEquals(123.47, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromCInLowerOctave() throws InvalidNoteDescriptorException
    {
        Note note = new Note("C", 3, 1);

        assertEquals(130.81, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromGInLowerOctave() throws InvalidNoteDescriptorException
    {
        Note note = new Note("G", 3, 1);

        assertEquals(196, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromBInHigherOctave() throws InvalidNoteDescriptorException
    {
        Note note = new Note("B", 4, 1);

        assertEquals(493.88, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromCInHigherOctave() throws InvalidNoteDescriptorException
    {
        Note note = new Note("C", 5, 1);

        assertEquals(523.25, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromGInHigherOctave() throws InvalidNoteDescriptorException
    {
        Note note = new Note("G", 5, 1);

        assertEquals(783.99, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromLetterWithSharpSymbol() throws InvalidNoteDescriptorException
    {
        Note note = new Note("A#", 4, 1);

        assertEquals(466.16, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromLetterWithFlatSymbol() throws InvalidNoteDescriptorException
    {
        Note note = new Note("Ab", 4, 1);

        assertEquals(415.3, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromLetterWithSharpSymbolEquivalentToOtherLetter() throws InvalidNoteDescriptorException
    {
        Note note = new Note("B#", 4, 1);

        assertEquals(523.25, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromLetterWithFlatSymbolEquivalentToOtherLetter() throws InvalidNoteDescriptorException
    {
        Note note = new Note("Cb", 5, 1);

        assertEquals(493.88, note.getFrequencyHz(), 0.01);
    }

    @Test
    public void testConstructorSetsFrequencyFromLetterWithAccidentalSymbolInOtherOctave() throws InvalidNoteDescriptorException
    {
        Note note = new Note("A#", 5, 1);

        assertEquals(932.33, note.getFrequencyHz(), 0.01);
    }

    @Test(expected = InvalidNoteDescriptorException.class)
    public void testConstructorThrowsExceptionForInvalidNoteDescriptor() throws InvalidNoteDescriptorException
    {
        new Note("", 5, 1);
    }
}
