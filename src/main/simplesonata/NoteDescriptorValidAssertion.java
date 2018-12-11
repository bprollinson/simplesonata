package simplesonata;

public class NoteDescriptorValidAssertion implements Assertion
{
    private String noteDescriptor;

    public NoteDescriptorValidAssertion(String noteDescriptor)
    {
        this.noteDescriptor = noteDescriptor;
    }

    public void validate()
    {
    }
}
