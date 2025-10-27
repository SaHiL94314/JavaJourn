package IntroTopics;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        if(num%2==1) System.out.println("number is odd");
        else System.out.println("number is even");

    }
}
