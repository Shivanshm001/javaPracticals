
class Rectangle{
    private double length,breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }


    public  double area(){
        return (this.length * this.breadth);
    }
}

public  class  Main{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5,6);
        Rectangle rect2 = new Rectangle(4,3);

        System.out.println("Area of reactangle 1 : " + rect1.area());
        System.out.println("Length of reactangle 1 : " + rect1.getLength());
        System.out.println("Breadth of reactangle 1 : " + rect1.getBreadth());

        System.out.println("Area of reactangle 2: " + rect2.area());
        System.out.println("Length of reactangle 2 : " + rect2.getLength());
        System.out.println("Breadth of reactangle 2 : " + rect2.getBreadth());

    }
}