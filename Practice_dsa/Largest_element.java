public class Largest_element {
    public static void main(String []args){
        int arr []= {5,4,3,2,1};
        int le = arr[0];
        int n = arr.length ;
        for(int i =0 ; i<n ; i++) {
            if(arr[i] > le){
                le = arr[i];
            }
        }
        System.out.print(le);
    }
}
