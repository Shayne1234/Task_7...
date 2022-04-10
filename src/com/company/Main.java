package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        Animal animal []= new Animal [6];
        animal[0] = new Mammal("Mammal", 7,18,"Animal");
        animal[1] = new Dog("Rex",19,11,"France","Brown");
        animal[2] = new Bird("shocks",3,7, "Parrot");
        animal[3] = new Fish("Whale",4,3,"Fresh");
        animal[4] = new BlowFish("Blow Fish",10,34,"Zimbabwe","Muramaba");
    }
}
