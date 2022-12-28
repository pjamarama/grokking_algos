/*
Define and initialize first and last indices of an array.
Create while loop and determine exit condition, it is when start index is equal end index.
    Inside a loop define middle index.
    If middle index value (miv) equals the required number (rn), return miv.
    If rn is greater than middle index (mi), set starting index equal mi + 1, else set end index to mi - 1.
Outside the loop return -1.
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[] {3, 6, 8, 9, 11, 14, 16, 19, 22, 29};
        System.out.println(bisearch(22, array));
    }

    private static int bisearch (int number, int[] array) {
        int min = 0;
        int max = array.length - 1;
        int step = 0;

        while (min <= max) {
            int mid = (min + max) / 2;
            ++step;

            if (array[mid] == number) {
                System.out.println("Found in " + step + " step(s)");
                return mid;
            }

            if (number < array[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return -1;
    }
}


