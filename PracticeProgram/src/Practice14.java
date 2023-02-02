import java.util.Scanner;

public class Practice14 {
    public static void main(String args[]){

        // the multiples of 3, 5, and both 3 and 5 within a range of 1 to n

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        for(int i=1 ; i<=num ; i++){

            int a = i*3;
            int b = i*5;

            if(a<=num) {

                System.out.print(a + " ");

            }
            if(b<=num){
                System.out.print(b + " ");
            }




        }
    }
}
