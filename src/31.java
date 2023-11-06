interface Animal{
    void eatFood(String food);
    void makeSound();
}


class Dog implements Animal{
    String name;
    Dog(String name){
        this.name = name;
    }

    @Override
    public void eatFood(String food) {
        System.out.println(name + " ate "+ food);
    }

    @Override
    public void makeSound() {
        System.out.println("Bhow bhow");
    }
}


class Main{
    public static void main(String[] args) {
        Dog shiro = new Dog("Shiro");
        shiro.eatFood("Egg");
    }
}