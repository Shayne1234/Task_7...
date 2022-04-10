package com.company;

public class Dog extends Mammal{

    private String featherColorElton55337;
    Dog(){
        super();
        featherColorElton55337="Black";
    }
    public Dog(String name,int age , int weight , String style, String featherColor){
        super(name,age,weight,style);
        this.featherColorElton55337= featherColor;
    }
    public Dog(int age , String style, String featherColor){
        super(age,style);
        this.featherColorElton55337 =  featherColorElton55337;
    }
    public void Run(){System.out.println("Go and run");}

    @Override
    public void WalkElton55337() {
        System.out.println("The Dog Is walking");
    }

    @Override
    public void getVoiceElton55337() {
        System.out.println("mooooo");
    }

    @Override
    public void eatElton55337(String meal) {
        System.out.println("Eat all the food");
    }
    public String getFeatherColorElton55337(){
        return this.featherColorElton55337;
    }
    public void setFeatherColorElton55337(String x){
        this.featherColorElton55337 = x;
    }
    public String ToString(){
        return "Dog :\n "+"Favorite Color : "+getFeatherColorElton55337();
    }

}
