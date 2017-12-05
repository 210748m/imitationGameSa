import java.util.Scanner;

public class imitationGameS
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);        
        System.out.println("Please write your new password");
        String asa = s.nextLine();
        Ciphers h = new Ciphers(asa);
        String pass = h.Ciphera();
        System.out.println(pass);
        System.out.println("Would you like to decipher the encrypted password?");
        String a = s.nextLine();
        if (a.contains("Y") || a.contains("y"))
        {
            Deciphers j = new Deciphers(pass);
            String hello = j.Deciphera();
            System.out.println(hello);
        }   
        else 
        {
            System.out.println("");
        }
        s.close();    
    }
}

        
