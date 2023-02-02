import java.util.Scanner;

public class Practice16 {

    public static void main(String args[]){

       /* You are given an integer n.
        Your task is to write a program to print the running sum from 1 to n and its average*/
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        for(int i=1 ; i<=num ; i++){

             sum = sum +i;

        }
        System.out.println("the sum of number is " + sum);

        int avg = sum/num;

        System.out.println("the average of a number is " + avg);
    }
}
