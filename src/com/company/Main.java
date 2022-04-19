package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Staff obj= new Staff();
        //obj.Initialize1();
        // obj.Print1();

        Animal animal []= new Animal [5];
        animal[0] = new Mammal("Mammal", 7,18,"Animal");
        animal[1] = new Dog("Rex",19,11,"France","Brown");
        animal[2] = new Bird("shocks",3,7, "Parrot");
        animal[3] = new Fish("Whale",4,3,"Fresh");
        animal[4] = new BlowFish("Blow Fish",10,34,"Zimbabwe","Muramaba");

        staff st = new staff();
        st.SalaryToPay (300);
        st.bonus(500);


        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];
        animalBehavior[0]=new Dog("Fox",15,11,"Germany","Brown");
        animalBehavior[1]=new BlowFish("Rex",13,10,"Zimbo","Blue");
        animalBehavior[2]=new Bird("shex",3,9,"Parrot");

        animalBehavior[0].sleep();
        animalBehavior[1].sleep();
        animalBehavior[2].sleep();

        for(Animal a: animal){
            a.moveElton55337();
        }
        for(Animal a: animal){
            AnimalName.name(a.getName());
        }

    }

}
