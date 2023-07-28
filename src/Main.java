import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {3, 4, 2, 7, 5, 22, 10, 8, 1, 9};
        mergeSort(myArray, myArray.length);
    }

    public static void mergeSort(int[] array, int n) {
        System.out.println(Arrays.toString(array));

       if (n<=1){
           return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];


        for(int i=0;i<mid;i++){
            left[i]=array[i];
        }
        for(int i=mid;i<n;i++){
            right[i-mid]=array[i];
        }

        mergeSort(left,mid);
        mergeSort(right, n-mid);
        merge(left,right,array);
    }


    public static void merge(int left[], int right[], int array[]) {

        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0;

        int k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
                k++;
            } else {
                array[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < leftSize) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = right[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(array));

    }

}
