package simplesonata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoteSequence
{
    private static final double DEFAULT_VOLUME = 100;

    private double tempoBPM;
    private double volume;
    private Note[] notes;

    public NoteSequence(double tempoBPM, Note... notes)
    {
        this(tempoBPM, NoteSequence.DEFAULT_VOLUME, notes);
    }

    public NoteSequence(double tempoBPM, double volume, Note... notes)
    {
        this.notes = notes;
        this.volume = volume;
        this.tempoBPM = tempoBPM;
    }

    public double getTempoInBeatsPerMinute()
    {
        return this.tempoBPM;
    }

    public double getVolume()
    {
        return this.volume;
    }

    public Note[] getNotes()
    {
        return this.notes;
    }
}
