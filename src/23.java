//Static members
class Cube{
    public static int number = 0;
    public double sideLength;
    Cube(double sideLength){
        this.sideLength = sideLength;
        number++;
    }

    public void cubeNumber(){
        System.out.println(number);
    }

    public double area(){
        return sideLength*sideLength*sideLength;
    }
}


class Main{
    Cube c1 = new Cube(3);
    Cube c2 = new Cube(4);
    Cube c3 = new Cube(5);

    c3.cubeNumber();
    c2.cubeNumber();
    c1.cubeNumber();
}