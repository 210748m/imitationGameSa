public class Ciphers
{
    private String pas;
    
    public Ciphers(String key2)
    {
        pas = key2;
    }
    
    public String Ciphera ()
    {
        String result = "";
        char a;
        final int mid = pas.length() / 2; 
        String[] parts = {pas.substring(0, mid), pas.substring(mid)};
        String sec = parts[1] + parts[0];
        int l = sec.length();
        for(int i = 0; i < l; i++)
        {
           a = sec.charAt(i);
           a += 12;
           result += a;
        }
        
        return result;
    }
}
