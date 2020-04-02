import java.util.Random;

public class Stester{

    public static void main(String a[]){
        int[] array = new int[10]; //quicksort array
        int[] array2 = new int[10]; //bubblesort array

        

        //Start Time in milliseconds
        long time = System.nanoTime();
        //Random Number generator for Quick Sort
        for (int i = 0; i < array.length; i++) {
            array[i] = randomRange(0,50000);
        }
        //Quicksort
        System.out.println(" Quick Sort\n");
        System.out.println("Values Before the sort:");
        for(int i = 0; i < array.length; i++)
            System.out.print( array[i]+"  ");
        System.out.println();
        quick_srt(array,0,array.length-1);
        System.out.print("Values after the sort:\n");
        for(int i = 0; i <array.length; i++)
            System.out.print(array[i]+"  ");
        System.out.println();
        time = System.nanoTime() - time;
        System.out.println("\nQuicksort took " + time + " milliseconds");

        //Start Time in milliseconds
        long time2 = System.nanoTime();
        //Random Number generator for Bubble Sort
        for (int i = 0; i < array2.length; i++) {
            array2[i] = randomRange(0,50000);
        }
        //Bubble Sort
        System.out.println("\n\n Bubble Sort\n");
        System.out.println("Values Before the sort:");
        for(int i = 0; i < array2.length; i++)
            System.out.print( array2[i]+"  ");
        System.out.println();
        bubble_srt(array2, array2.length);
        System.out.print("Values after the sort:\n");
        for(int i = 0; i <array2.length; i++)
            System.out.print(array2[i]+"  ");
        System.out.println();
        time2 = System.nanoTime() - time2;
        System.out.println("\nBubblesort took " + time2 + " milliseconds");

    }

    public static void quick_srt(int array[],int low, int n){
        int lo = low;
        int hi = n;
        if (lo >= n) {
            return;
        }
        int mid = array[(lo + hi) / 2];
        while (lo < hi) {
            while (lo<hi && array[lo] < mid) {
                lo++;
            }
            while (lo<hi && array[hi] > mid) {
                hi--;
            }
            if (lo < hi) {
                int T = array[lo];
                array[lo] = array[hi];
                array[hi] = T;
            }
        }
        if (hi < lo) {
            int T = hi;
            hi = lo;
            lo = T;
        }
        quick_srt(array, low, lo);
        quick_srt(array, lo == low ? lo+1 : lo, n);

    }

    public static void bubble_srt( int a[], int n ){
        int i, j,t=0;
        for(i = 0; i < n; i++){
            for(j = 1; j < (n-i); j++){
                if(a[j-1] > a[j]){
                    t = a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                }
            }
        }
    }

    public static int randomRange(int min, int max) {
        return (int) Math.round(((Math.random() * (max - min)) + min));
    }
}