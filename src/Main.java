/*
Question : Given an array 'a', return the double value of given number in the same array without creating new array.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temp, temp2;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("ENTER THE ELEMENT OF ARRAY :");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("NOW, FIRST PRINTING THE ORIGINAL VALUE OF ARRAY :");
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println();
        System.out.println("NOW, PRINTING THE RUNNING SUM OF ARRAY :");
        for (int i = 0; i < arr.length; i++){
            temp = arr[i];
            temp2 = temp + arr[i];
            System.out.print(" " + temp2);
            arr[i]++;
        }
    }
}