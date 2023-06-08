package org.lessons.java.zoo;

class Cane extends Animale {
    @Override
    public void verso() {
        System.out.println("Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("Il cane mangia carne.");
    }
}