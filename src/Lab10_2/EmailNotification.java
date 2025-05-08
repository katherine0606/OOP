package Lab10_2;

public class EmailNotification extends Notification{
    public EmailNotification(){
        super("Email");
    }

    @Override
    public void send(String message){
        super.send(message);
    }
}
