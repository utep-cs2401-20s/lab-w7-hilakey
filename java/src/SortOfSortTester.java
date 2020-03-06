import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;


public class SortOfSortTester {
    /*Test #1
    * This is a "normal" test checking to see if the method will correctly
    * "sort-of-sort" the array. I chose this test because this is a likely array
    * that will pass through.
    * So, I expect the test to pass. --> The test PASSED
    */
    @Test
    public void sort1(){
        int[] a = {200, 90, 323, 0, 61, 4000};
        int[] result = {200, 90, 0, 61, 323, 4000};
        SortOfSort.sortArray(a);
        assertArrayEquals(result, a);
    }

    /* Test #2
     * This test checks to see that if an array of size 1 will be sorted correctly. The method should just not alter
     * the array and leave it as is. This test is to check if it will enter the while loop to search for the largest int.
     * I expect the array to pass. --> The test PASSED
     */
    @Test
    public void sort2(){
        int[] a = {3};
        int[] result = {3};
        SortOfSort.sortArray(a);
        assertArrayEquals(result, a);
    }

    /*Test #3
     * For this one, I'm testing to see if it will sort an array with negative and positive values.
     * I chose this test because I wanted to see if the logic in my code would get confused.
     * I think this test will fail. --> This test PASSED
     */
    @Test
    public void sort3(){
        int[] a = {-12, 3, 55, -9, 17, 6};
        int[] result = {6, 3, -12,-9 ,17,55};
        SortOfSort.sortArray(a);
        assertArrayEquals(result, a);
    }

    /* Test #4:
     * This test tests an even size array with duplicates. I chose this because duplicates are highly
     * probable to be inside an array. I expect the test to pass. --> The test PASSED
     * */
    @Test
    public void sort4(){
        int[] a = {10, 10, 2, 6, 23, 6, 0, 4, 8, 3};
        int[] result = {10, 8, 4, 3, 0, 2, 6 ,6 ,10,23};
        SortOfSort.sortArray(a);
        assertArrayEquals(result, a);
    }

    /* Test #5
    * This final test checks if the method works on an array with negative values that have already been
    * sort of sorted. The goal is to see if the method will reproduce the same array. I expect the test to
    * pass. --> The test PASSED
    * */
    @Test
    public void sort5(){
        int[] a = {-13, -25, -67,  -78, -250, -52, -40, -11, -1};
        int[] result = {-13, -25, -67,  -78, -250, -52, -40, -11, -1};
        SortOfSort.sortArray(a);
        assertArrayEquals(result, a);
    }
}
