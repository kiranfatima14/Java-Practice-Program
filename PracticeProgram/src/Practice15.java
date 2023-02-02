import java.util.Scanner;

public class Practice15 {
    public static void main(String args[]){

        //The rules of the FizzBuzz game are given below:
        //1. If a given number is divisible by 3 then the program should print "Fizz".
        //2. If a given number is divisible by 7 then the program should print "Buzz".
        //3. If a given number is divisible by both 3 and 7 then the program should print "FizzBuzz".
        //4. Otherwise print the given number as it is.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        for(int i=1 ; i<=num ; i++){

            if(i%3==0){

                System.out.print("Fizz" + " ");
            }
            if(i%7==0){
                System.out.print("Buzz" + " ");
            }
            else {
                System.out.print(i + " ");
            }

        }

    }
}
