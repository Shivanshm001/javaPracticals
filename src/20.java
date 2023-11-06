//Herarichal inheritance
class Animal{
    public void eatFood(String food){
        System.out.println("Ate "+ food);
    }
}


class Dog extends Animal{
    public void speak(){
        System.out.println("Bhow");
    }
}

class Cat extends Animal{
    public void speak(){
        System.out.println("Meow");
    }
}

class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eatFood("Dog food");
        cat.eatFood("Cat food");
    }
}