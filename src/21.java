//Overloading

class Main{
    public static void main(String[] args) {
        System.out.println(sum(2,4));
        System.out.println(sum(2,4,6));
    }

    private static double sum(double n1, double n2){
        return n1 + n2;
    }

    private static double sum(double n1,double n2, double n3){
        return n1+n2+n3;
    }
}