public class fibonacci_series {
    public static void main(String args[]){
        int n =10;
        int a =0;
        int b =1;
        System.out.println(a);
        System.out.println(b);

        for(int i =0 ; i<n ; i++){
            int next_number= a+b;
            System.out.println(next_number);
            a=b;
            b = next_number;
        }
    }
}
