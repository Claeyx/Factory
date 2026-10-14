package notifications;
public class WspNotification implements Notification{
    @Override 
    public void send(String recipient, String message){
        System.out.println("Enviando mensaje de whatsapp a "+recipient+":"+message);
    }
}