package ARRAY;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        int arr[]=new int[4];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;// Inetilization and printing the array
        for(int i=0;i<4;i++){
            System.out.println(arr[i]+" ");
        }
        Scanner sc=new Scanner(System.in);//Taking input in an array
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int []arr2=new int[n];
        System.out.println("Take input");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
