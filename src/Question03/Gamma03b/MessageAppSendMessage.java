package Question03.Gamma03b;

public class MessageAppSendMessage implements Command{
    private MessageApp type;

    public MessageAppSendMessage(MessageApp type) {
        this.type = type;
    }

    @Override
    public void execute() {
        this.type.sendMessage();
    }
}
