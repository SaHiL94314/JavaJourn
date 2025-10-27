package LLD_principles.lecture2OCP.Example1.better_code;

public class Email implements Notification{
    public void send(){
        System.out.println("sending email");
    }
}
