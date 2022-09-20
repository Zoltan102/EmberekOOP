package hu.petrik.emberekoop;

import java.io.FileReader;
import java.util.*;

public class Emberek {
    private List<Ember> emberek;

    public Emberek(Ember[] emberekArray) {
        this.emberek = new LinkedList<>();
        Collections.addAll(this.emberek, emberekArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ember e: this.emberek) {
            sb.append(e.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public Emberek(String fileName){
        FileReader fr = new FileReader(fileName);
    }

}
