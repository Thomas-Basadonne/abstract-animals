package org.lessons.java.zoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Caratteristiche Cane");
        Cane cane = new Cane();
        cane.verso();
        cane.mangia();
        cane.dormi();

        System.out.println("Caratteristiche Passerotto");
        Passerotto passerotto = new Passerotto();
        passerotto.verso();
        passerotto.mangia();
        passerotto.dormi();

        System.out.println("Caratteristiche Aquila");
        Aquila aquila = new Aquila();
        aquila.verso();
        aquila.mangia();
        aquila.dormi();

        System.out.println("Caratteristiche Delfino");
        Delfino delfino = new Delfino();
        delfino.verso();
        delfino.mangia();
        delfino.dormi();
    }
}






