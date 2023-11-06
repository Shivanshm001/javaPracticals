import java.util.Scanner;


class Main{
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        size = sc.nextInt();

        try{
            int[] arr = createIntArray(size);
            System.out.println("Entered values : ");
            for(int val : arr){
                System.out.print(val + " ");
            }
        } catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }

    public static int[] createIntArray(int size){
        System.out.println("Enter "+size+" positive integers : ");
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            if(val <= 0 ) throw new IllegalArgumentException("Value must be positive and greater than 0.");
            arr[i] = val;
        }

        return  arr;
    }
}