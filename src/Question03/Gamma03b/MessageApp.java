package Question03.Gamma03b;

// Receiver Class 1
class MessageApp {
    void readMessage() {
        System.out.println("Inside " + this.getClass().getSimpleName() + ": readMessage()");
    }

    void readMessageList() {
        System.out.println("Inside " + this.getClass().getSimpleName() + ": readMessageList()");
    }

    void sendMessage() {
        System.out.println("Inside " + this.getClass().getSimpleName() + ": sendMessage()");
    }
}
