package factory;

import notifications.Notification;
import notifications.EmailNotification;
import notifications.SMSNotification;
import notifications.WspNotification;
import notificationstype.NotificationType;

public class NotificationFactory {

    public static Notification createNotification(NotificationType type) {
        if (type == null) {
            throw new IllegalArgumentException("El tipo de notificación no puede ser nulo.");
        }

        switch (type) {
            case EMAIL:
                return new EmailNotification();
            case SMS:
                return new SMSNotification();
            case WHATSAPP:
                return new WspNotification();
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado: " + type);
        }
    }
}