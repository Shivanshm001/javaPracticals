//Inside shape/Square.java
package shape;

public class Square{
    private double sideLength;
    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    public double area(){
        return sideLength*sideLength;
    }

    public  double parameter(){
        return 4*sideLength;
    }
}