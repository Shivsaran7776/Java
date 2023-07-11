import java.util.*;
class mintosec{
    int sec;
    void second(int m){
        sec=m*60;
        System.out.println("Minutes converted to seconds:"+sec);
    }
    public static void main(String args[]){
        int min;
        System.out.println("Enter the minutes:");
        Scanner sc = new Scanner(System.in);
        min=sc.nextInt();
        mintosec res=new mintosec();
        res.second(min);
        sc.close();
    }
}