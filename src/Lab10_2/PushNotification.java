package Lab10_2;

public class PushNotification extends Notification{
    public PushNotification() {
        super("Push");
    }

    @Override
    public void send(String message){
        super.send(message);
    }
}
