import java.util.Scanner;

public class Practice18 {

    //fibonacci series
    //0,1,1,2,3,5,8...

    public void fibonacci(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int startNum = 0;
        int lastNum = 1;


        for(int i=0 ; i<num ; i++){ //i=0 ,1 ,2

            System.out.print(startNum+ " ");

            int nextNum = startNum + lastNum;
            startNum = lastNum;
            lastNum = nextNum;

            }
        }



    public static void main(String args[]){

        Practice18 p = new Practice18();

        p.fibonacci();



    }




}
