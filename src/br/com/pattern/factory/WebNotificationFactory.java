package br.com.pattern.factory;

import br.com.pattern.products.*;

public class WebNotificationFactory implements NotificationFactory {
    @Override
    public MessageNotification createMessageNotification() {
        return new EmailNotification();
    }

    @Override
    public AlertNotification createAlertNotification() {
        return new WebPushNotification();
    }
}
