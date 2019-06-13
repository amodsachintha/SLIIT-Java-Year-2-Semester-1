package Question03.Gamma03b;

public class MainApp {
    public static void main(String[] args) {

        MessageApp microsoftOutlook = new MessageApp();
        SoftwarePackage excel = new SoftwarePackage("Excel");

        Command readMessageList = new MessageAppReadMessageList(microsoftOutlook);
        Command sendMessage = new MessageAppSendMessage(microsoftOutlook);
        Command readMessage = new MessageAppReadMessage(microsoftOutlook);

        Command open = new SoftwarePackageOpen(excel);
        Command close = new SoftwarePackageClose(excel);

        VirtualAssistant va = new VirtualAssistant();
        va.setCommand("ReadMessageList",1,readMessageList);
        va.setCommand("SendMessage",2,sendMessage);
        va.setCommand("ReadMessage",3,readMessage);
        va.setCommand("Open",4,open);
        va.setCommand("Close",5,close);

        va.commandPressed(2);
        va.commandPressed(4);
    }
}
