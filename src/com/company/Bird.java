package com.company;

class Bird extends Animal implements AnimalBehavior,AnimalMove{

    private String Type_BirdElton55337;

    public Bird(){
        super();
        Type_BirdElton55337=" ";
    }
    public Bird(String name,int age , int weight , String Type_of_Bird){
        super(name,age,weight);
        this.Type_BirdElton55337 = Type_of_Bird;
    }
    public Bird(int age , String Type_of_Bird){
        super(age);
        this.Type_BirdElton55337=Type_of_Bird;
    }

    public void Fly(){
        System.out.println("im flying ");
    }

    @Override
    void getVoiceElton55337() {
        System.out.println("chruuuuu");
    }
    @Override
    public void eatElton55337(String meal) {
        System.out.println("Bird is eating a "+ meal);
    }

    @Override
    void eat(String FoodName) {

    }

    public String getTypeElton55337(){
        return this.Type_BirdElton55337;
    }
    public void setType_BirdElton55337(String w){
        this.Type_BirdElton55337 = w;
    }
    public String ToString(){
        return "Bird :\n "+"Type of Bird : "+Type_BirdElton55337;
    }


    @Override
    public void sleep() {
        System.out.println( );
    }

    @Override
    public void moveElton55337() {
        System.out.println( "fly");

    }
}

