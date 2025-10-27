package IntroTopics;
import  java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        boolean flag=isArmstrong(n);
        if(flag) System.out.println("armstrong number");
        else System.out.println("not an armstrong number");
    }
    public static boolean isArmstrong(int num){
        int val=num;
        int cnt=0;
        while(val>0){
            cnt++;
            val/=10;
        }
        val=num;
        int sum=0;
        while(val>0){
            int rem=val%10;
            sum+=Math.pow(rem,cnt);
            val/=10;
        }
        return sum==num;
    }
}
