package org.lessons.java.zoo;

public class Main {
    //ESERCIZIO 1
   /* public static void main(String[] args) {
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
    } */

    //ESERCIZIO 2
    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();
        Cane cane = new Cane();

        System.out.println("Il Passerotto dice:");
        faiVolare(passerotto);  // Output: Sto volando!!!

        System.out.println("L'Aquila dice:");
        faiVolare(aquila);     // Output: Sto volando!!!

        System.out.println("Il Delfino dice:");
        faiNuotare(delfino);    // Output: Sto nuotando!!!

        System.out.println("Il Cane dice:");
        faiNuotare(cane);    // Output: Sto nuotando!!!

    }
}






