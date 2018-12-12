package simplesonata;

public class NoteDescriptorValidAssertion implements Assertion
{
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 2;
    private static final char FLAT_SYMBOL = 'b';
    private static final char SHARP_SYMBOL = '#';

    private String noteDescriptor;

    public NoteDescriptorValidAssertion(String noteDescriptor)
    {
        this.noteDescriptor = noteDescriptor;
    }

    public void validate() throws InvalidNoteDescriptorException
    {
        if (!this.noteDescriptorHasValidLength())
        {
            throw new InvalidNoteDescriptorException();
        }

        if (!this.noteDescriptorHasValidNoteLetter())
        {
            throw new InvalidNoteDescriptorException();
        }

        if (!this.noteDescriptorHasValidAccidentalSymbol())
        {
            throw new InvalidNoteDescriptorException();
        }
    }

    private boolean noteDescriptorHasValidLength()
    {
        int length = this.noteDescriptor.length();

        return length >= NoteDescriptorValidAssertion.MIN_LENGTH && length <= NoteDescriptorValidAssertion.MAX_LENGTH;
    }

    private boolean noteDescriptorHasValidNoteLetter()
    {
        char noteLetter = this.noteDescriptor.toUpperCase().charAt(0);

        return noteLetter >= 'A' && noteLetter <= 'G';
    }

    private boolean noteDescriptorHasValidAccidentalSymbol()
    {
        if (this.noteDescriptor.length() == NoteDescriptorValidAssertion.MIN_LENGTH)
        {
            return true;
        }

        char accidentalSymbol = this.noteDescriptor.charAt(1);

        return accidentalSymbol == NoteDescriptorValidAssertion.SHARP_SYMBOL || accidentalSymbol == NoteDescriptorValidAssertion.FLAT_SYMBOL;
    }
}
