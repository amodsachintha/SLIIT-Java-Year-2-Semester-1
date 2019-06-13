package Question03.Gamma03b;

public class MessageAppReadMessage implements Command{
    private MessageApp type;

    MessageAppReadMessage(MessageApp type) {
        this.type = type;
    }

    @Override
    public void execute() {
        this.type.readMessage();
    }
}
