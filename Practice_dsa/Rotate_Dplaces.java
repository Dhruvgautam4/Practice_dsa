public class Rotate_Dplaces {
    public static void main(String args[]){
        int arr[] = {1,23,4,5,7,8,9};
        int n = arr.length ;
       int d= 3;
       int [] temp = new int[d];
        for(int i =0 ; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i =d ; i<n;  i++){
           arr[i-d] =arr[i];
        }
        for(int  i =n-d; i<n ; i++){
            arr[i] = temp[i-(n-d)];
        }
        for(int i =0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
