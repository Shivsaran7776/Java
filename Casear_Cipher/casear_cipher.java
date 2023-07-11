//  Arrays in java

import java.util.*;
public class casear_cipher{
    public static StringBuffer decrypt(String t,int k){
        StringBuffer res = new StringBuffer();
        for(int i=0;i<t.length();i++)
        {
            if(Character.isUpperCase(t.charAt(i)))
            {
                char ch = (char) (((int)t.charAt(i)+k-65)%26 +65);
                res.append(ch);
            }
            else
            {
                char ch = (char)(((int)t.charAt(i)+k-97)%26 +97);
                res.append(ch);
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        String text;
        int key;
        System.out.println("Enter the string to be converted to casear cipher:");
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        System.out.println("Enter an integer input for key to be decrypted:");
        key = sc.nextInt();
        System.out.println("Cipher message is:"+decrypt(text,key));
        sc.close();
    }
}