import java.util.Scanner;

public class practice5 {
    public static void main(String args[]){
        //difference of 4

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();

        for(int i=0 ; i<num ; i++){

            i = i+3 ;
            if(i<num) {
                System.out.println(i);
            }

        }
    }
}
