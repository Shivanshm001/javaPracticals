//Inside shape/Circle.java
package shape;

public class Circle{
    private final double PI = 3.141;
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return PI*(radius*radius);
    }

    public double circumference(){
        return 2*PI*radius;
    }
};
