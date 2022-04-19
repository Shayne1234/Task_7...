package com.company;

  public class BlowFish extends Fish implements AnimalBehavior, AnimalMove{
        private String TypeElton55337;

        public BlowFish(){
            super();
            TypeElton55337 = "Tetraodontidae ";
        }
        public BlowFish(String name, int age , int weight , String style, String Type){
            super(name,age,weight,style);
            this.TypeElton55337 = Type;
        }
        public BlowFish(int age , String style, String Type){
            super(age,style);
            this.TypeElton55337 = Type;
        }
        public void travel(){
            System.out.println("Take me to the sea  _");}

        @Override
        public void food_type() {
            System.out.println("Go to the sea and feed the BlowFish ");
        }

        @Override
        void getVoiceElton55337() {
            System.out.println("Brrrrrr");
        }

        @Override
        public void eatElton55337(String meal) {
            System.out.println("I am Eating "+meal);
        }
        public String getType(){
            return this.TypeElton55337;
        }
        public void setType(String w){
            this.TypeElton55337 = w;
        }

        public String ToString(){
            return "BlowFish :\n "+"Type : "+TypeElton55337;
        }

      @Override
      public void sleep() {
          System.out.println("shhh");

      }
      @Override
      public void moveElton55337 () {
          System.out.println("swim");

      }
  }



