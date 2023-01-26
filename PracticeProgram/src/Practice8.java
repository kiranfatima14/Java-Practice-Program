import java.util.Scanner;

public class Practice8 {
    public static void main(String args[]){
        //print n , n-k , n-2k , n-3k

       Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        for(int i=num ; i>0 ; i--) {

            System.out.println(i);

        }
        System.out.println();

            System.out.println("enter a number you want to minus");
        int n = sc.nextInt();

        System.out.println();
        for(int i=num ; i>0 ;){

            System.out.println( i);
            i = i-n;

        }
        System.out.println("series of number n-2k");

        for(int j=num ; j>0 ; ){

            System.out.println(j);
            j = j-2*n;
        }
        System.out.println();

        System.out.println("series of number n-3k");

        for(int k=num ; k>0 ; ){

            System.out.println(k);
            k = k-3*n;
        }



    }
}
