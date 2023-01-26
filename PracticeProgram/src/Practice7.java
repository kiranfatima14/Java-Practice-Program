import java.util.Scanner;

public class Practice7 {
    public static void main(String args[]){

        //print n , n-3 ,n-6;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

       for(int i=n ; i>0 ; i--) {

            System.out.print(i + " ");

        }
        System.out.println();

       for(int j=n ; j>0 ; ){

           System.out.print(j+ " ");

           j = j-3;

       }
        System.out.println();

       for(int k=n ; k>0;){

           System.out.print(k + " ");

           k= k-6;
       }



    }
}
