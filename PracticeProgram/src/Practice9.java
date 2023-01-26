import javax.print.DocFlavor;

public class Practice9 {
    public static void main(String args[]){

       char c='a' ;
       char s ='A' ;
       /* for(c ='A' , s='a'  ; c<='Z'; c++){

            System.out.print(c + " " + s + " ");
                s++;

        }*/

        while(c<='z'&& s<='Z'){

            System.out.print(c + " " + s + " ");
            c++;
            s++;

        }
    }
}
