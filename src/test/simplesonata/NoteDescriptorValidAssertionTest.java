package simplesonata;

import org.junit.Test;

public class NoteDescriptorValidAssertionTest
{
    @Test(expected = InvalidNoteDescriptorException.class)
    public void testAssertThrowsExceptionForNoteDescriptorThatIsTooShort()
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("");

        assertion.validate();
    }

    @Test(expected = InvalidNoteDescriptorException.class)
    public void testAssertThrowsExceptionForNoteDescriptorThatIsTooLong()
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("C##");

        assertion.validate();
    }

    @Test(expected = InvalidNoteDescriptorException.class)
    public void testAssertThrowsExceptionForNonLetterFirstCharacter()
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("#");

        assertion.validate();
    }

    @Test(expected = InvalidNoteDescriptorException.class)
    public void testAssertThrowsExceptionForInvalidLetterFirstCharacter()
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("H");

        assertion.validate();
    }

    @Test
    public void testAssertDoesNotThrowExceptionForValidLetterNoteDescriptor()
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("C");

        assertion.validate();
    }

    @Test
    public void testAssertDoesNotThrowExceptionForValidLetterAndAccidentalSymbolNoteDescriptor()
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("C#");

        assertion.validate();
    }

    @Test
    public void testAssertDoesNotThrowExceptionForValidLowerCaseLetterNoteDescriptor()
    {
        NoteDescriptorValidAssertion assertion = new NoteDescriptorValidAssertion("c");

        assertion.validate();
    }
}
