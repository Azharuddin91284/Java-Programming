//Using BubbleSort we can sort in a way to first use arr.length-1 looping and under then use arr.length-i-1 then we can check each number using swaping if bigger numb er then swap that to temp variavble and last last call the function 
// compare each element if lessthan then put the small element before bigger element use swapping
package SortingProblems;

import java.util.Scanner;
// time complexity= 0(n^2)
// Bubble sort
public class BubbleSort {
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // take user input as array
        System.out.println("Enter the element in  the array ");
        int arr []=new int [6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        // time complexity= 0(n^2)
       // Bubble sort

       // int [] arr={5,7,8,9,3,2};
        for(int i=0;i<arr.length-1;i++){    //n-1 times loop is running
            for(int j=0;j<arr.length-i-1;j++){  // (n-1)+(n-2)+(n-3)+(n-4)+....  so totaly O(n^2)
                // swapping of two number
                // Lower to higher
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
               }
                // higher to lower
               /*  if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                */
            }
        }
        bubble(arr);
    }
    
}
