public class Practice10 {
    public static void main(String args[]){

        char c ='a';
        char s = 'C';

        for(; c<'z' && s<'Z' ; ){


           System.out.print(c + " " );
           c+=4;


            System.out.print(s+ " ");
            s+= 4;

        }
    }
}
