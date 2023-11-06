//Single inheritance
class Animal{
    void eatFood(String food){
        System.out.println("Ate " + food);
    }
}


class Dog extends Animal{
    void bark(){
        System.out.println("Bhow");
    }
}

class Main{
    public static void main(String[] args) {
        Dog shiro = new Dog();
        shiro.eatFood("Biscuit");
    }
}