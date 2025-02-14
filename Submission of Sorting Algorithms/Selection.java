import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
          int[] scores = {85, 78, 92, 69, 74, 88}; // Sample exam scores
        selection(scores);
        System.out.println("Sorted Exam Scores: " + Arrays.toString(scores));
    }

    public static void selection(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int small=i;


            for(int j=i+1;j<n-1;j++){
                if(arr[j]<arr[small]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }
}
