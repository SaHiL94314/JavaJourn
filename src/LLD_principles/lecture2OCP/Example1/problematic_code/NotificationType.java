package LLD_principles.lecture2OCP.Example1.problematic_code;

public enum NotificationType {
    SMS,
    Email,
    whatsapp;

    public void sendSms(){
        System.out.println("sending sms");
    }
    public void sendEmail(){
        System.out.println("sending email");
    }
    public void sendWhatsapp(){
        System.out.println("sending whatsapp message");
    }
}
