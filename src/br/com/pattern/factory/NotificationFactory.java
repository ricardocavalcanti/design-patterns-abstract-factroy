package br.com.pattern.factory;

import br.com.pattern.products.AlertNotification;
import br.com.pattern.products.MessageNotification;

public interface NotificationFactory {
    MessageNotification createMessageNotification();

    AlertNotification createAlertNotification();
}
