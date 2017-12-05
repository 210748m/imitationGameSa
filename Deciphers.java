
public class Deciphers
{
    private String pas;
    
    public Deciphers(String key)
    {
        pas = key;
    }
    
    public String Deciphera()
    {
        String result = "";
        char a;
        int l = pas.length();
        for(int i = 0; i < l; i++)
        {
           a = pas.charAt(i);
           a -= 12;
           result += a;
        }
        final int mid = result.length() / 2; 
        String[] parts = {result.substring(0, mid), result.substring(mid)};
        String sec = parts[1] + parts[0];
        if(pas.length() % 2 == 1){
            char firstLetter = sec.charAt(0);
            sec = sec.substring(1);
            sec = sec + firstLetter;
            return sec;
        }
        else
        {
            return sec;
        }
    }
}

