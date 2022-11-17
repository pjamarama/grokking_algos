/*
Create loop for unsorted array.
Set index of min value. It will move together with unsorted array.
Create loop to find the min value.
Swap the current element of the outer loop with the min value element. Swap indices not values!
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[] {2,7,1,5,8,4};
        selectSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // loop for moving boundaries of the unsorted array
            for (int j = i + 1; j < array.length; j++) {
                int minIdx = i;
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }

                int temp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = temp;
            }
        }
    }




}
