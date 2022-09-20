package hu.petrik.emberekoop;

public class Main {
    public static void main(String[] args) {
        Ember ember = new Ember("Joe Doe", "1960-3-13", "Budapest");
        Ember ember1 = new Ember("Jane Doe", "1968-11-6", "Budapest");
        Ember ember2 = new Ember("Joe Doe Jr", "2004-1-21", "Debrecen");
        Ember ember3 = new Ember("Sárosi Roland", "1973-1-1", "Szeged");
        Ember ember4 = new Ember("Róth Nikolett", "1984-7-30", "Pécs");
        Emberek emberek = new Emberek(new Ember[]{ember, ember1, ember2, ember3, ember4});
        System.out.println(emberek);
    }
}
