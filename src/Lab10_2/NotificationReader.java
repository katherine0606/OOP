package Lab10_2;

public class NotificationReader extends Consumer{
    @Override
    public void readNewMessages(){
        if (Notification.lastReadIndex >= Notification.messageCount){
            System.out.println("No new messages.");
            return;
        }

        System.out.println("Reading new messages...");
        for (int i = Notification.lastReadIndex; i < Notification.messageCount; i++){
            System.out.println(Notification.messages[i]);
        }

        Notification.lastReadIndex = Notification.messageCount;
    }
}
