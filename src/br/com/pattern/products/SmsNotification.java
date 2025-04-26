package br.com.pattern.products;

public class SmsNotification implements MessageNotification {
    @Override
    public void sendMessage() {
        System.out.println("Sending SMS message...");
    }
}
