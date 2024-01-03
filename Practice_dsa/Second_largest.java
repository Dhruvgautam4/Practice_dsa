import java.util.Arrays;

public class Second_largest {
    static int largest(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<n ; i++){
            if(arr[i] > max){
                max =arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr []={5,4,2,1,3,7};
        int n =arr.length ;
        int second_largest =0;
        int large= largest(arr,n);
        Arrays.sort(arr);
        for(int i =n-2 ; i>=0 ;i--){

            if(arr[i] !=large){
                second_largest =arr[i];
                break;
            }

        }
        System.out.println(second_largest);
    }
}
