package com.aula.abstrata.introducao;

// Classe concreta
class ClasseConcreta {
}
// Classe abstrata

abstract class ClasseAbstrata {
}

abstract class Animal {
	public abstract void imprime();
}

class Cachorro extends Animal {

    public void imprime() {
        System.out.println("Sou um cachorro!!");
    }
}

class Cavalo extends Animal {
    public void imprime() {
        System.out.println("Sou um cavalo!!");
    }
}

public class Principal {

    public static void main(String[] args) {
        ClasseConcreta objetoInstancia = new ClasseConcreta();
//        ClasseAbstrata objetoInstancia = new ClasseAbstrata();  // ERRO DE COMPILAÇÃO, por causa do uso do operador new.
        Cachorro cachorro = new Cachorro();

        Animal animal;
        animal = new Cachorro();
        animal.imprime();
        animal = new Cavalo();
        animal.imprime();
    }

}
