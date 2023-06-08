package org.lessons.java.zoo;

class Passerotto extends Animale {
    @Override
    public void verso() {
        System.out.println("Cip cip!");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia semi.");
    }
}
