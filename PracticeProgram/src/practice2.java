public class practice2 {
    public static void main(String args[]){

        //5 ,6 ,7 ,8, ,9 ,10
        //10 ,9,8,7,6,5
        for(int i=5  , j=10 ; i<16 ; i++){

            if(i<=10){
                System.out.print(i + " ");
            }
            if(i==10){
                System.out.println();
            }
            if(i>=10){
                System.out.print(j + " ");
                j--;
            }
        }
    }
}
