package Question03.Gamma03b;

class VirtualAssistant {
    private Command[] commands;

    VirtualAssistant() {
        this.commands = new Command[6];
    }

    void setCommand(String keyword, int index, Command obj) {
        this.commands[index] = obj;
    }

    void commandPressed(int index) {
        this.commands[index].execute();
    }


}
