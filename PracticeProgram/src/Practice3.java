import java.util.Scanner;

public class Practice3 {
    public static void main(String args[]) {

        //4,5,6,7,8,9,10,11
        //11,10,9,8,7,6,5,4
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int first = sc.nextInt();

        System.out.println("Enter the last number");
        int last = sc.nextInt();

            int value = first -1;
            int add = last - value;
            add = add +last;


        for (int k =first  , i=last ; k<add; k++) {

                if(k<=last) {
                    int n = first++;
                    System.out.print(n + " ");

                }
                if(k==last){
                    System.out.println();
                }
                if(k>=last){

                    System.out.print(i + " ");
                    i--;
                }
            }
        System.out.println(

        );

       /* for(int i=last; i>=first ; i--){

            System.out.print(i + " ");

        }*/


    }
}
