import java.util.Scanner;

public class Practice12 {
    public static void main(String args[]){
        //printing Even and Odd numbers

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        int num = 0;

        for(int i=0; i<arr.length ; i++){

            System.out.println("Enter a number");
            arr[i] = sc.nextInt();


        }

        for(int j=0 ; j<arr.length ; j++) {

               num = arr[j];
            if (num % 2 == 0) {
                System.out.println("Even");
            }
            if (num % 2 != 0) {
                System.out.println("Odd");
            }

        }


    }
}
