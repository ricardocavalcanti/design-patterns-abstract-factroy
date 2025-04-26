import br.com.pattern.factory.MobileNotificationFactory;
import br.com.pattern.factory.NotificationFactory;
import br.com.pattern.factory.WebNotificationFactory;
import br.com.pattern.products.AlertNotification;
import br.com.pattern.products.MessageNotification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new MobileNotificationFactory();
        MessageNotification message = factory.createMessageNotification();
        AlertNotification alert = factory.createAlertNotification();

        message.sendMessage();
        alert.sendAlert();

        System.out.println("-----");

        factory = new WebNotificationFactory();
        message = factory.createMessageNotification();
        alert = factory.createAlertNotification();

        message.sendMessage();
        alert.sendAlert();
    }
}