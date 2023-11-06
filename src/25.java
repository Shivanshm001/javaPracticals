//Greatest number from a list

class Main{
    public static void main(String[] args) {
        int[] list = {4,6,33,44,55,65,34,54,32,11,31,78,87};
        System.out.println("Greatest number in list is "+)

    }

    public static int greatestNumber(int[] list){
        int greatest = list[0];
        for(int item : list){
            if(item > greatest){
                greatest = item;
            }
        }
        return greatest;
    }
}