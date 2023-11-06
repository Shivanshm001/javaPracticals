class Main{
    public static void main(String[] args) {
        int size, sum;
        int[][] matrix;
        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        sum = sumOfDiagonalSquares(matrix);
        System.out.println("Sum of diagonals squared : " + sum);
        
    }
    public static int sumOfDiagonalSquares(int[][] matrix) {
        int sum = 0;
        int size = matrix.length; //Square matrix

        for (int i = 0; i < size; i++) {
            int element = matrix[i][i];
            sum += element * element;
        }
        return sum;
    }
}