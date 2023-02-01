/*
Question : Given an array 'a', return the prefix sum/running sum in the same array without creating new array.
_______________________________________________________________________________________________________________
 */
import java.util.Scanner;
public class prefix_sum_two_pointer {
    static int[] RunningSumArray(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++){
            prefix[i] = prefix[i -1] + arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("ENTER THE ELEMENT OF ARRAY :");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("NOW, FIRST PRINTING THE ORIGINAL VALUE OF ARRAY :");
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println();
        System.out.println("NOW, PRINTING THE RUNNING SUM OF ARRAY :");
        int[] arr2 = RunningSumArray(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr2[i]);
        }
    }
}
