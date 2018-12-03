package simplesonata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoteSequence
{
    private List<Note> notes;

    public NoteSequence(Note... notes)
    {
        this.notes = new ArrayList<Note>(Arrays.asList(notes));
    }

    public Note getNote(int index)
    {
        return this.notes.get(index);
    }
}
