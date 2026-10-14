import factory.NotificationFactory;
import notifications.Notification;
import notificationstype.NotificationType;

public class Main {
    public static void main(String[] args) {
        // Creación e invocación mediante la fábrica
        Notification email = NotificationFactory.createNotification(NotificationType.EMAIL);
        email.send("usuario@ejemplo.com", "Bienvenido a la plataforma");

        Notification sms = NotificationFactory.createNotification(NotificationType.SMS);
        sms.send("+573001234567", "Tu código de acceso es 9876");

        Notification whatsapp = NotificationFactory.createNotification(NotificationType.WHATSAPP);
        whatsapp.send("+573001234567", "Tu pedido va en camino");
    }
}