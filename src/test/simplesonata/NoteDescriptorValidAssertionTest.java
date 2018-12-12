package simplesonata;

import org.junit.Test;

public class NoteDescriptorValidAssertionTest
{
    @Test(expected = InvalidNoteDescriptorException.class)
    public void testAssertThrowsExceptionForNoteDescriptorThatIsTooShort() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("");

        assertion.validate();
    }

    @Test(expected = InvalidNoteDescriptorException.class)
    public void testAssertThrowsExceptionForNoteDescriptorThatIsTooLong() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("C##");

        assertion.validate();
    }

    @Test(expected = InvalidNoteDescriptorException.class)
    public void testAssertThrowsExceptionForNonLetterFirstCharacter() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("#");

        assertion.validate();
    }

    @Test(expected = InvalidNoteDescriptorException.class)
    public void testAssertThrowsExceptionForInvalidLetterFirstCharacter() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("H");

        assertion.validate();
    }

    @Test
    public void testAssertDoesNotThrowExceptionForValidLetterNoteDescriptor() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("C");

        assertion.validate();
    }

    @Test(expected = InvalidNoteDescriptorException.class)
    public void testAssertThrowsExceptionForInvalidAccidentalSymbol() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("B$");

        assertion.validate();
    }

    @Test
    public void testAssertDoesNotThrowExceptionForValidLetterAndSharpSymbolNoteDescriptor() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("C#");

        assertion.validate();
    }

    @Test
    public void testAssertDoesNotThrowExceptionForValidLetterAndFlatSymbolNoteDescriptor() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("Bb");

        assertion.validate();
    }

    @Test
    public void testAssertDoesNotThrowExceptionForValidLowerCaseLetterNoteDescriptor() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("c");

        assertion.validate();
    }

    @Test
    public void testAssertDoesNotThrowExceptionForMinimumNoteDescriptor() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("Ab");

        assertion.validate();
    }

    @Test
    public void testAssertDoesNotThrowExceptionForMaximumNoteDescriptor() throws InvalidNoteDescriptorException
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("G#");

        assertion.validate();
    }
}
