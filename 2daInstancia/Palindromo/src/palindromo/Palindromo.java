package palindromo;
/**
 *
 * @author Wart
 */
import java.util.Scanner;
public class Palindromo{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese un caracter: ");
        String str= input.nextLine();
        
        int i,j;
        i=0;
        j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{break;}
        }
        if(i>=j){
         System.out.println(str + " es palindromo");
        }else{
             System.out.println(str + " no es palindromo");
        }
    }
}
