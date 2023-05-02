import java.util.*;
class casear_cipher
{
    public static StringBuffer encrypt(String t,int k)
    {
        StringBuffer res = new StringBuffer();
        for(int i=0;i<t.length();i++)
        {
            if(Character.isUpperCase(t.charAt(i)))
            {
                char ch = (char)(((int)t.charAt(i)+k-65)%26+65);
                res.append(ch);
            }
            else
            {
                char ch = (char)(((int)t.charAt(i)+k-97)%26+97);
                res.append(ch);
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        String text;
        int key;
        System.out.println("Enter the message:");
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        System.out.println("Enter integer value for key to decrpyted:");
        key = sc.nextInt();
        System.out.println("THe Cipher message is:"+encrypt(text,key));
        sc.close();
    }
}