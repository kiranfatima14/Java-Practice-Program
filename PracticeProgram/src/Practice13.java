import java.util.Scanner;

public class Practice13 {
    public static void main(String args[]){

       // Start printing from n, keep on updating n by dividing n by 3 each time, and print the updated
       // value of n each time.


        int num =0;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number to divide it by 3");

            for(int i=0 ; i<3; i++) {

               num = sc.nextInt();

                for (int j=num; j>0; ) {


                    int div = j / 3;

                    if (div>0) {
                        System.out.print(div + " ");

                    }

                    j= j / 3;

                }

            }

      //  System.out.print(num + " ");




    }
}
