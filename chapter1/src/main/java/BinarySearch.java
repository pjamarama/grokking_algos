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
        int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        bisearch(1, array);
    }

    private static int bisearch (int number, int[] array) {
//        int step = 0;
//        int startIdx = 0;
//        int finIdx = array[array.length - 1];
//
//        while (startIdx <= finIdx) {
//            ++step;
//            int midIdx = (startIdx + finIdx) / 2;
//            if (array[midIdx] == number) {
//                System.out.println("Number found in " + step +" step(s)");
//                return midIdx;
//            }
//
//            if (array[midIdx] > number) {
//                finIdx = midIdx - 1;
//            } else {
//                startIdx = midIdx + 1;
//            }
//        }
//        return -1;
//    }

}


