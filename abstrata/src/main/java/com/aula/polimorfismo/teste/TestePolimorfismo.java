package com.aula.polimorfismo.teste;

import java.util.ArrayList;


class Animal {
    public String toString() {
        return "Animal 123";
    }
}
class Cachorro extends Animal {
    public String toString() {
        return "Cachorro 123";
    }
}
class Cavalo extends Animal {
    public String toString() {
        return "Cavalo 123";
    }
}

class Fruta {}
class Abacate extends Fruta{}
class Pera extends Fruta{}

public class TestePolimorfismo {

    public static void main(String[] args) {
        Animal qualquerAnimal;
        Fruta qualquerFruta;
        
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Cachorro());
        animais.add(new Cavalo());
        animais.add(new Cavalo());
        animais.add(new Cavalo());
        animais.add(new Cavalo());
        animais.add(new Cavalo());
        
        
        animais.remove(0);
        animais.remove(0);
//        for(int i = 0; i < animais.size(); i++);
//            System.out.println(animais.get(i));
//        
        for (Animal animal : animais) {
            System.out.println(animal);
        }
//        qualquerAnimal = new Animal();
//        System.out.println(qualquerAnimal);
//        qualquerAnimal = new Cachorro();
//        System.out.println(qualquerAnimal);
//        qualquerAnimal = new Cavalo();
//        System.out.println(qualquerAnimal);
////        Cavalo cavalo1 = new Animal();
//        Cavalo cavalo2 = new Cavalo();
//        
////        qualquerAnimal = new Double();
//        
//        qualquerFruta = new Fruta();       // ok
//        System.out.println(qualquerFruta);
//        qualquerFruta = new Abacate();     // ok
//        System.out.println(qualquerFruta);
//        qualquerFruta = new Pera();        // ok
//        System.out.println(qualquerFruta);
//        
//        Object objeto = new Pera();
//        objeto = new Animal();
//        
////        qualquerAnimal = new Fruta();     // NÃO ok
////        qualquerAnimal = new Abacate();   // NÃO ok
////        qualquerAnimal = new Pera();      // NÃO ok
////
////        quaquerFruta = new Animal();      // NÃO ok
////        quaquerFruta = new Cachorro();    // NÃO ok
////        quaquerFruta = new Cavalo();      // NÃO ok       
        
    }

}
