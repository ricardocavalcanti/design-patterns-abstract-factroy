package br.com.pattern.products;

public class WebPushNotification implements AlertNotification {
    @Override
    public void sendAlert() {
        System.out.println("Sending Web Push alert...");
    }
}
