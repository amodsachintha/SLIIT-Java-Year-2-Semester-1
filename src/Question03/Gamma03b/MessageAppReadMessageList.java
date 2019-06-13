package Question03.Gamma03b;

public class MessageAppReadMessageList implements Command {

    private MessageApp type;

    public MessageAppReadMessageList(MessageApp type) {
        this.type = type;
    }

    @Override
    public void execute() {
        this.type.readMessageList();
    }
}
