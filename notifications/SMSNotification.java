package notifications;
public class SMSNotification implements Notification{
    @Override 
    public void send(String recipient, String message){
        System.out.println("Enviando SMS a "+recipient+":"+message);
    }
}