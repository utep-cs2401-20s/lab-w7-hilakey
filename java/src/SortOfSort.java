import java.util.Arrays;

public class SortOfSort {
    public static void  main(String[] args){
        /*int[] a = {2, 9, 3, 0, 6, 4, 1};*/
        int[] b = {1,2,3,4,5};
        int[] c = {1,2};
        int[] d = {10, 34, 20, 13, 54};
        sortArray(d);
    }


    public void resetValues(){

    }
    public static void sortArray(int[] arr){
        int switchCount = 0;
        int left = 0; // pointer that keeps track of the left most element during the "sort-of-sorting".
        int right = arr.length-1;// pointer that keeps track of the right most element during the "sort-of-sorting".
        int largest = 0; // stores the current largest integer.
        int temp; // temporarily stores an element's value during swapping.
        int index = 0; // stores the index where the largest int was found.

        while (left < right){
            largest = arr[left];
            for(int j = left + 1; j <= right; j++) {
                // begin searching for the current largest number in the array.
                if (arr[j] > largest) {
                    largest = arr[j];
                    index = j;
                }
            }

                // once largest int has been found, find out whether it will be place on either the left/rightmost side
                // of the array.
                if(switchCount > 4){
                    switchCount = 0; //reset switchCount to zero so it will add largest int to left side again.
                }

                /*swaps largest value to the right side of the array*/
                if(switchCount <= 2){
                    temp = arr[right]; //storing 'last' element value on the right.
                    arr[right] = largest;
                    arr[index] = temp;
                    right--; //right pointer moves backward by 1.(scope decreases)
                    switchCount++;
                }

            /*swaps largest value to the left side of the array*/
                if(switchCount <= 4 && switchCount > 2){
                    temp = arr[left];
                    arr[left] = largest;
                    arr[index] = temp;
                    left++; //left pointer moves forward by 1.(scope decreases)
                    switchCount++;
                }

        }


        printArray(arr);
        /* TODO: make  a print array method that prints updating swaps*/

    }

    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }


}





