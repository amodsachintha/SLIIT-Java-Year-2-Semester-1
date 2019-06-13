package Question03.Gamma03b;

// Receiver Class 1
public class MessageApp {
    public void readMessage(){
        System.out.println("Inside " + this.getClass().getSimpleName() + ": readMessage()");
    }

    public void readMessageList(){
        System.out.println("Inside " + this.getClass().getSimpleName() + ": readMessageList()");
    }

    public void sendMessage(){
        System.out.println("Inside " + this.getClass().getSimpleName() + ": sendMessage()");
    }
}
