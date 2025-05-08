package Lab10_2;

public class SMSNotification extends Notification{
    public SMSNotification(){
        super("SMS");
    }

    @Override
    public void send(String message){
        super.send(message);
    }
}
