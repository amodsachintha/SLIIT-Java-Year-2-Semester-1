package Question03.Gamma03b;

public class VirtualAssistant {
    private Command[] commands;

    public VirtualAssistant() {
        this.commands = new Command[6];
    }

    public void setCommand(String keyword, int index, Command obj) {
        this.commands[index] = obj;
    }

    public void commandPressed(int index) {
        this.commands[index].execute();
    }


}
