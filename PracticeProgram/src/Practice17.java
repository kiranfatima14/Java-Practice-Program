import java.util.Scanner;

public class Practice17 {
    //Running the sum of loop
    //eg : 1,2,3,4,5
    //output: 1 ,3 ,6,10 ,15

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter a length of number");
        int numLen = sc.nextInt();

        int num[] = new int[numLen];

        System.out.println("Enter " + numLen + " numbers");

        for(int i=0 ; i<numLen ; i++){

             num [i] = sc.nextInt();

        }
        int sum = 0;


       /* for(int i = 0; i<numLen ; i++){

            sum = sum + num[i];
            System.out.print(sum + " ");


        }

        */
        int j=0;
        while(j<numLen){
            sum =sum+ num[j];

            System.out.print(sum + " ");

            j++;
        }


    }
}
