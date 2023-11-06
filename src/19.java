//Multilevel inheritance
class Animal{
    public void eatFood(String food){
        System.out.println("Ate "+food);
    }
}

class Dog extends Animal{
    public void speak(){
        System.out.println("Bhow ");
    }
}


class Husky extends Dog{
    public void run(){
        System.out.println("Husky started running.");
    }
}

class Main{
    public static void main(String[] args) {
        Husky doggo = new Husky();
        doggo.eatFood("Chicken");
        doggo.speak();
        doggo.run();
    }
}