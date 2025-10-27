package IntroTopics;

public class TypeCastingDemo {
    public static void main(String[] args) {
        char ch=70;
        System.out.println(ch);
//        ch=ch+1; not working , have to explicitly conver to char
        ch=(char)(ch+1);
        System.out.println(ch);

        ch='a'+1;
        System.out.println(ch);

        System.out.println(10+20+"hello"+30+50);
        System.out.println(2+' '+5);
        System.out.println(2+" "+5);
        System.out.println("hello"+'\t'+"world");
        System.out.println("hello"+"\t"+"world");
        System.out.println(1+'\t'+5);
        System.out.println(1+"\t"+5);

    }
}
