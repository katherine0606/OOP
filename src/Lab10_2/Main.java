package Lab10_2;

public class Main {
    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification(),
                new SMSNotification(),
                new PushNotification()
        };

        for (Notification notification : notifications) {
             notification.send("Hello, User!");
        }

        NotificationReader reader = new NotificationReader();
        reader.readNewMessages();

        notifications[0].send("This is a test message for Email");
        notifications[1].send("This is a test message for SMS");
        notifications[2].send("This is a test message for Push");
    }
}
