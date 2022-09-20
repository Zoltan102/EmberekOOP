package hu.petrik.emberekoop;

import java.time.LocalDate;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int getSzulEv() {
        return Integer.parseInt(szulDatum.substring(0, 4));
    }

    public int getSzulHo() {
        return Integer.parseInt(szulDatum.split("-")[1]);
    }

    public int getSzulNap() {
        return Integer.parseInt(szulDatum.split("-")[2]);
    }

    public int getEletkor() {
        if (LocalDate.now().getMonthValue() <= getSzulHo() && LocalDate.now().getDayOfMonth() <= getSzulNap()) {
            return LocalDate.now().getYear() - getSzulEv();
        } else {
            return (LocalDate.now().getYear() - getSzulEv()) - 1;
        }
    }

    @Override
    public String toString() {
        return String.format("%-30s %10s %d %20s", nev, szulDatum, getEletkor(), szulHely);
    }
}