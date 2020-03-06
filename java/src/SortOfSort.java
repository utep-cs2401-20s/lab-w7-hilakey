import java.util.Arrays;

public class SortOfSort {

    public static void sortArray(int[] arr){
        int switchCount = 0;
        int left = 0; // pointer that keeps track of the left most element during the "sort-of-sorting".
        int right = arr.length - 1;// pointer that keeps track of the right most element during the "sort-of-sorting".
        int largest; // stores the current largest integer.
        int temp; // temporarily stores an element's value during swapping.
        int index = 0; // stores the index where the largest int was found.

        /*if the array is <= 1, then just leave it alone*/
        if(arr.length <= 1){
            printArray(arr);
        }

        while (left < right){
            largest = arr[left];
            for(int j = left; j <= right; j++) {
                // begin searching for the current largest number in the array.
                if (arr[j] >= largest) {
                    largest = arr[j];
                    index = j;
                }
            }
            // once largest int has been found, find out whether it will be place on either the left/rightmost side
            // of the array.
            if(switchCount == 4){
                switchCount = 0; //reset switchCount to zero so it will add largest int to left side again.
            }

            /*swaps largest value to the right side of the array*/
            if(switchCount < 2){
                temp = arr[right]; //storing 'last' element value on the right.
                arr[right] = largest;
                arr[index] = temp;
                right--; //right pointer moves backward by 1.(scope decreases)
                switchCount++;
            }

        /*swaps largest value to the left side of the array*/
            else {
                temp = arr[left];
                arr[left] = largest;
                arr[index] = temp;
                left++; //left pointer moves forward by 1.(scope decreases)
                switchCount++;
            }

        }
        printArray(arr);
    }

    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }


}





