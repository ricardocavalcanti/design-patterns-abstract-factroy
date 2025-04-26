package br.com.pattern.products;

public class PushNotification implements AlertNotification {
    @Override
    public void sendAlert() {
        System.out.println("Sending Push alert...");
    }
}
