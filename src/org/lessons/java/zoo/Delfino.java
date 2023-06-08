package org.lessons.java.zoo;

class Delfino extends Animale {
    @Override
    public void verso() {
        System.out.println("Non so che verso fa :(");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia pesci.");
    }
}