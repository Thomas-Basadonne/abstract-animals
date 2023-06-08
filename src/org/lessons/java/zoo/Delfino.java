package org.lessons.java.zoo;

class Delfino extends Animale implements INuotante {
    @Override
    public void verso() {
        System.out.println("Non so che verso fa :(");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia pesci.");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}