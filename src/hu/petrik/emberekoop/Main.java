package hu.petrik.emberekoop;

public class Main {
    public static void main(String[] args) {
        Ember ember = new Ember("Joe Doe", "1960-3-13", "Budapest");
        Ember ember2 = new Ember("Jane Doe", "1968-11-6", "Budapest");
        Ember ember3 = new Ember("Joe Doe Jr", "2004-1-21", "Debrecen");
        System.out.println(ember);
        System.out.println(ember2);
        System.out.println(ember3);
    }
}
