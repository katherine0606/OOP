package Lab10_2;

abstract class Notification implements Producer{
    protected static String[] messages = new String[100];
    protected static int messageCount = 0;
    protected static int lastReadIndex = 0;

    protected String type;

    public Notification(String type) {
        this.type = type;
    }

    @Override
    public void send(String message) {
        if (messageCount < messages.length) {
            String fullMessage = type + " message is: " + message;
            messages[messageCount] = fullMessage;
            messageCount++;
            System.out.println("Sending " + type.toLowerCase() + ": " + message);
        } else {
            System.out.println("Message storage is full!");
        }
    }
}
