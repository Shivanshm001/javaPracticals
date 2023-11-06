//Sort numbers
class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 1, 4, 7, 8, 0};
        System.out.println("Original array :");
        printIntArray(arr);
        Main.bubbleSort(arr);
        System.out.println("\nSorted array : ");
        printIntArray(arr);
    }

    private static void bubbleSort(int[] nums) {
        int len = nums.length;
        boolean swapped;

        for (int i = 0; i < len - 1; i++) {
            swapped = false;
            for (int j = 0; j < len - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private static void printIntArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
