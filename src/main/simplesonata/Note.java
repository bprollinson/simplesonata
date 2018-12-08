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
    private double durationS;

    public Note(double frequencyHz, double durationS)
    {
        this.frequencyHz = frequencyHz;
        this.durationS = durationS;
    }

    public Note(char noteLetter, int octave, double durationS)
    {
        double exponent = octave - Note.A4_OCTAVE + Note.noteLetterOffsets.get(noteLetter) / 12d;
        this.frequencyHz = Note.A4_FREQUENCY * Math.pow(2, exponent);
        this.durationS = durationS;
    }

    public double getFrequencyHz()
    {
        return this.frequencyHz;
    }

    public double getDurationInSeconds()
    {
        return this.durationS;
    }
}
