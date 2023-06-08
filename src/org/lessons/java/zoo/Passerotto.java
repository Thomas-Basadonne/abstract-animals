package org.lessons.java.zoo;

class Passerotto extends Animale implements IVolante{
    @Override
    public void verso() {
        System.out.println("Cip cip!");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia semi.");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
