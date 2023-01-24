import java.util.Scanner;

public class Practice4 {
    public static void main(String args[]){

        //print multiples of n
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        // multiples to show
        System.out.println("Enter a last number multiple of " + n);
        int m = sc.nextInt();

        int div = m/n ;

        for(int i=0 ; i<=div ; i++){
            int res = n * i ;
            if(res <= m) {

                System.out.println(n + "x" + i + " " + res);
            }
        }
    }
}
