package LLD_principles.lecture2OCP.Example1.problematic_code;
import java.util.ArrayList;
import java.util.List;

public class NotificationSender {
    public void sendNotifications(List<NotificationType> notificationTypeList){
        for(NotificationType type:notificationTypeList){
            if(type.name()=="SMS"){
                type.sendSms();
            }
            else if(type.name()=="Email"){
                type.sendEmail();
            }
            else if(type.name()=="whatsapp"){
                type.sendWhatsapp();
            }
        }
    }
    public static void main(String[] args) {
        NotificationType obj1=NotificationType.Email;
        NotificationType obj2=NotificationType.SMS;
//        System.out.println(obj);

        NotificationSender user=new NotificationSender();
        List<NotificationType> l=new ArrayList<>();

        l.add(obj1);
        l.add(obj2);
        user.sendNotifications(l);
    }
}
