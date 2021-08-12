public class selectionSort {
    public static void main(String[]args){
        int[] arr = {1, 29, 14, 15, 94};

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j< arr.length; j ++ ){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.println();
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }

        }
    }
}
