// Select one elemnt and compare if it is bigger then then swap the smallest elemt to the bihger pace and bigger elemnt to the the sammele place
package SortingProblems;

public class SelectionSort {
    public static void Selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr []={2,6,7,8,4};

        // Selection sort
        // time complexity O(n^2)
        for(int i=0;i<arr.length-1;i++){
            int Smallest=i;
            for(int j=i+1;j<arr.length;j++){// loop running n+(n-1)+(n-2)+(n-3)+...
                if(arr[Smallest] >arr[j]){
                Smallest=j;
                }
            }
            int temp=arr[Smallest];
            arr[Smallest]=arr[i];
            arr[i]=temp;            

        }
        Selection(arr);
    }
    
}
