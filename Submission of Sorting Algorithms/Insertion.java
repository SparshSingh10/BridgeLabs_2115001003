import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        insertion(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    public static void insertion(int[] arr){

        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>key){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=key;
           
        }
    }
}