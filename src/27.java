//Transpose of a matrix
import  java.util.Scanner;

class Main{
    public static void main(String[] args){
        int rows,cols;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows of the matrix : ");
        rows = sc.nextInt();
        System.out.println("Enter cols of the matrix : ");
        cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transposedMatrix = new int[cols][rows];


        System.out.println("Enter the values of matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix : ");
        display(matrix);
        transposedMatrix = transponse(matrix);
        System.out.println("Transposed matrix : ");
        display(transposedMatrix);
    }

    public static int[][] transponse(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return  result;
    }

    public static void display(int[][] m){
        int rows = m.length;
        int cols = m[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}