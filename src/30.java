import shape.*;

class Main{
    public static void main(String[] args) {
        Square s1 = new Square(5);
        Circle c1 = new Circle(5);

        System.out.println("Area of circle c1 : "+ c1.area());
        System.out.println("Area of square s1 : "+ s1.area());
    }
}