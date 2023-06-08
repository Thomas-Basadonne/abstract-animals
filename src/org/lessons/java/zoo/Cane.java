package org.lessons.java.zoo;

class Cane extends Animale implements INuotante {
    @Override
    public void verso() {
        System.out.println("Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("Il cane mangia carne.");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}