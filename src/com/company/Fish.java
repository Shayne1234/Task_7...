package com.company;

 class Fish extends Animal{

    private String typeElton55337;

    public Fish(){
        super();
       typeElton55337=" ";
    }
    public Fish(String name,int age , int weight , String typeElton55337){
        super(name,age,weight);
        this.typeElton55337 = typeElton55337;
    }
    public Fish(int age , String typeElton55337){
        super(age);
        this.typeElton55337 = typeElton55337;
    }

    public void food_type(){
        System.out.println("im looking for food ");}

    @Override
    void getVoiceElton55337() {
        System.out.println("Brrrrrr");
    }
    @Override
    public void eatElton55337(String meal) {
        System.out.println("Fish is eating a "+ meal);
    }
    public String getTypeElton55337(){
        return this.typeElton55337;
    };
    public void setTypeElton55337(String x){
        this.typeElton55337 = x;
    };
    public String ToString(){
        return "Fish :\n " + "Type of Fish : "+ typeElton55337;
    }

}
