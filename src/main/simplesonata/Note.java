package simplesonata;

import java.util.HashMap;
import java.util.Map;

public class Note
{
    private static final double A4_FREQUENCY = 440;
    private static final int A4_OCTAVE = 4;

    private static Map<Character, Integer> noteLetterOffsets;
    {
        Note.noteLetterOffsets = new HashMap<Character, Integer>();
        Note.noteLetterOffsets.put('A', 0);
        Note.noteLetterOffsets.put('B', 2);
        Note.noteLetterOffsets.put('C', -9);
        Note.noteLetterOffsets.put('D', -7);
        Note.noteLetterOffsets.put('E', -5);
        Note.noteLetterOffsets.put('F', -4);
        Note.noteLetterOffsets.put('G', -2);
    }

    private double frequencyHz;
    private double durationB;

    public Note(double frequencyHz, double durationB)
    {
        this.frequencyHz = frequencyHz;
        this.durationB = durationB;
    }

    public Note(String noteDescriptor, int octave, double durationB) throws InvalidNoteDescriptorException
    {
        new NoteDescriptorValidAssertion(noteDescriptor).validate();

        char noteLetter = noteDescriptor.toUpperCase().charAt(0);
        int noteLetterOffset = Note.noteLetterOffsets.get(noteLetter);
        int accidentalOffset = this.calculateAccidentalOffset(noteDescriptor);
        int noteOffset = noteLetterOffset + accidentalOffset;

        double exponent = octave - Note.A4_OCTAVE + noteOffset / 12d;

        this.frequencyHz = Note.A4_FREQUENCY * Math.pow(2, exponent);
        this.durationB = durationB;
    }

    public double getFrequencyInHertz()
    {
        return this.frequencyHz;
    }

    public double getDurationInBeats()
    {
        return this.durationB;
    }

    private int calculateAccidentalOffset(String noteDescriptor)
    {
        if (noteDescriptor.length() == 1)
        {
            return 0;
        }

        char accidental = noteDescriptor.charAt(1);

        return accidental == '#' ? 1 : -1;
    }
}
