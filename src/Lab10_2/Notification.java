package Lab10_2;

abstract class Notification implements Producer{
    static String[] messages = new String[100];
    static int messageCount = 0;
    static int lastReadIndex = 0;

    String type;

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
