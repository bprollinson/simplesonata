package simplesonata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NoteSequenceTest
{
    @Test
    public void testConstructorSetsMaximumVolumeByDefault()
    {
        NoteSequence sequence = new NoteSequence(60, new Note(440, 1));

        assertEquals(100, sequence.getVolume(), 0.01);
    }
}
