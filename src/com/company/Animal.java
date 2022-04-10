package com.company;

abstract class Animal {
    private String nameElton55337;
    private int ageElton55337;
    private int weightElton55337;

    public Animal(int age ) {
        this.ageElton55337 = age;

    }

    public Animal() {
        ageElton55337 = weightElton55337=0;
        nameElton55337="None";

    }

    public void eatElton55337(String meal){};

    public Animal(String name, int age, int weight) {
        this.nameElton55337 = name;
        this.ageElton55337= age;
        this.weightElton55337 = weight;

    }


    public abstract void eat(String FoodName);

    abstract void getVoiceElton55337();

    public String getName(){
        return nameElton55337;
    }

    public void setName(String name){
        this.nameElton55337 = name;
    }
    public int getAge(){
        return ageElton55337;

    }
    public void setAge(int age){
        this.ageElton55337 = age;
    }

    public int getWeight(){
        return weightElton55337;
    }
    public void setWeight(int weight){
        this.weightElton55337 = weight;
    }

}








