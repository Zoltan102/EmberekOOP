package hu.petrik.emberekoop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Emberek {
    private List<Ember> emberek;

    public Emberek(Ember[] emberekArray) {
        this.emberek = new LinkedList<>();
        Collections.addAll(this.emberek, emberekArray);
    }

    public Emberek(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        this.emberek = new LinkedList<>();
        BufferedReader br = new BufferedReader(fr);
        String sor = br.readLine();
        while (sor != null && sor.equals("")) {
            String[] adatok = sor.split(";");
            Ember e = new Ember(adatok[0], adatok[1], adatok[2]);
            emberek.add(e);
            sor = br.readLine();
        }

        br.close();
        fr.close();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ember e : this.emberek) {
            sb.append(e.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
