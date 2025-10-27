package LLD_principles.lecture2OCP.Example1.better_code;
import java.util.List;
public class NotificationSender {
    public  void sendNotification(List<Notification> notifications){
        for(Notification notifi:notifications){
            notifi.send();
        }
    }
}
