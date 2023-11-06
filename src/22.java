//Overriding
class Animal{
    public void eatFood(String food){
        System.out.println("Ate "+ food);
    }
}

class Dog extends Animal{
   @Override
    public void eatFood(String food) {
        System.out.println("Dog ate "+food);
    }
}

class Main{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eatFood("Grass");

        Dog dog = new Dog();
        dog.eatFood("Eggs");
    }
}