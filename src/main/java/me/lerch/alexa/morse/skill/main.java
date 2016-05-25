package me.lerch.alexa.morse.skill;
import me.lerch.alexa.morse.skill.utils.ImageUtils;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.*;
import java.io.*;

/**
 * Created by Kay on 20.05.2016.
 */
public class main {

    public static void main(String[] args) throws IOException, InvalidMidiDataException, MidiUnavailableException, LineUnavailableException, InterruptedException, UnsupportedAudioFileException {

        System.out.println(ImageUtils.getImage("MorseCoder", false));
    }
}
