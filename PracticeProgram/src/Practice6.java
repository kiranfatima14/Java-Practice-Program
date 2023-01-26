import java.util.Scanner;

public class Practice6 {
    public static void main(String args[]){
        //printing all odd numbers

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Ending number");
        int endNum = sc.nextInt();

        System.out.println("Enter a start number");
        int startNum = sc.nextInt();

        for(int i=endNum ; i>startNum ; i--){

            if(i%2!=0){
                System.out.println(i);

            }
        }
    }
}
