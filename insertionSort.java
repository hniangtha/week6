public class insertionSort {
    public static void main(String[] arg) {
        int[] arr = {1, 29, 14, 15, 94};

        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = tmp;

            System.out.println();
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }

        }
    }
}
