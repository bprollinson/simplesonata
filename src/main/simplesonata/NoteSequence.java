package simplesonata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoteSequence
{
    private Note[] notes;

    public NoteSequence(Note... notes)
    {
        this.notes = notes;
    }

    public Note[] getNotes()
    {
        return this.notes;
    }
}
