package simplesonata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoteSequence
{
    private double tempoBPM;
    private Note[] notes;

    public NoteSequence(double tempoBPM, Note... notes)
    {
        this.notes = notes;
        this.tempoBPM = tempoBPM;
    }

    public double getTempoInBeatsPerMinute()
    {
        return this.tempoBPM;
    }

    public Note[] getNotes()
    {
        return this.notes;
    }
}
