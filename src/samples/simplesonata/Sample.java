package simplesonata;

import javax.sound.sampled.LineUnavailableException;

public interface Sample
{
    public void play() throws LineUnavailableException;
}
