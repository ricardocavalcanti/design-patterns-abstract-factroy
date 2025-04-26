package br.com.pattern.factory;

import br.com.pattern.products.AlertNotification;
import br.com.pattern.products.MessageNotification;
import br.com.pattern.products.PushNotification;
import br.com.pattern.products.SmsNotification;

public class MobileNotificationFactory implements NotificationFactory {
    @Override
    public MessageNotification createMessageNotification() {
        return new SmsNotification();
    }

    @Override
    public AlertNotification createAlertNotification() {
        return new PushNotification();
    }
}
