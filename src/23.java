//Static members
class Cube{
    private static int number = 0;
    public double sideLength;
    Cube(double sideLength){
        this.sideLength = sideLength;
        number++;
    }

    public  void cubeNumber(){
        System.out.println(number);
    }

    public double area(){
        return sideLength*sideLength*sideLength;
    }
}


class Main{
    public static void main(String[] args) {
        Cube c1 = new Cube(3);
        Cube c2 = new Cube(4);
        Cube c3 = new Cube(5);

        c1.cubeNumber();
        c2.cubeNumber();
        c3.cubeNumber();
    }

}