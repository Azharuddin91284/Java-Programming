// Here we divide arr into two parts Sorted and unsorted and use the conecept for sorting the arr in less tine complexity
// in sorted arry inially one element and use unsorted check if element is bigger or less just create one space in sorted array by shiftinf element and put that element in sorted array it going till completly didn't sorted
package SortingProblems;

public class InsertionSort {
    public static void Insertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr []={2,6,7,8,4};
        // Insertion sort time complexity O(n)
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j]){// arr[j] belong to sorted arrray
                arr[j+1]=arr[j];
                j--;

            }
           // placement
           arr[j+1]=current;

        }
        Insertion(arr);
    }

}
