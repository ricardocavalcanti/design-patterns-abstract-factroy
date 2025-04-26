package br.com.pattern.products;

public class EmailNotification implements MessageNotification {
    @Override
    public void sendMessage() {
        System.out.println("Sending Email message...");
    }
}
