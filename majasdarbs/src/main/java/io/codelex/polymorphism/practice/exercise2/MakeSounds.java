package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> sounds = new ArrayList<>();
        sounds.add(new Firework());
        sounds.add(new Radio());
        sounds.add(new Parrot());

        for (Sound sound : sounds) {
            sound.playSound();
            
        }

    }
}
