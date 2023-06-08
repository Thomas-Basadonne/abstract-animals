package org.lessons.java.zoo;

class Aquila extends Animale {
    @Override
    public void verso() {
        System.out.println("Criiik!");
    }

    @Override
    public void mangia() {
        System.out.println("L'aquila mangia piccoli animali.");
    }
}