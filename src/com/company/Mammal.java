package com.company;

public class Mammal extends Animal implements AnimalBehavior, AnimalMove,AnimalName{
    private String styleElton55337;
    public Mammal(){
        super();
        styleElton55337=" ";
    }
    public Mammal(String name,int age , int weight , String style){
        super(name,age, weight);
        this.styleElton55337 = style;
    }   ;
    public Mammal(int age , String style){
        super(age);
        this.styleElton55337= style;
    }

    public void WalkElton55337(){
        System.out.println("papapaap");
    }

    @Override
    public void getVoiceElton55337() {
        System.out.println(" Sound ");
    }
    @Override
    public void eat(String meal) {
        System.out.println("Mammal eats "+ meal);
    }
    public String getstyleElton55337(){
        return this.styleElton55337;
    }
    public void setstyleElton55337(String x){
        this.styleElton55337=x;
    }

    public String ToStringElton55337(){
        return "Mammal :\n "+"style : "+styleElton55337;
    }




    @Override
    public void moveElton55337() {
        System.out.println("walk");
}


    @Override
    public void sleep() {

    }
}