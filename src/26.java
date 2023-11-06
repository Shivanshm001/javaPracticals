import java.util.Scanner;

class Matrix{
    private int[][] m1,m2;

    Matrix(int[][] m1, int[][] m2){
        this.m1 = m1;
        this.m2 = m2;
    }

    public int[][] add(){
        if(!m1 || !m2) return;

        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];

        for(int i =0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public int[][] multiply(){
        if(!m1 || !m2) return;

        int rowsM1 = m1.length;
        int colsM1 = m1[0].length;
        int rowsM2 = m2.length;
        int colsM2 = m2[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rowsM1; i++) {
            for (int j = 0; j < colsM2; j++) {
                for (int k = 0; k < colsM1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public void display(){
        System.out.println("Matrix 1 : ");
        display(m1);
        System.out.println("Matrix 2 : ");
        display(m2);

    }

    public void display(int[][] m){
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


class Main{
    public static void main(String[] args){
        int size, choice;
        int[][] m1,m2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix size : ");
        size = sc.nextInt();

        System.out.println("Enter values of matrix 1 : ");

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values of matrix 2 : ");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                m2[i][j] = sc.nextInt();
            }
        }

        Matrix mat = new Matrix(m1,m2);
        sc.close();
        while(true){

            System.out.println("0. Exit" +
                    "1. Add " +
                    "2. Multiply" +
                    "3. Display")


            if(choice == 0) break;
            else if(choice == 1) mat.add();
            else if(choice == 2) mat.multiply();
            else if(choice == 3) mat.display();
        }
    };
}