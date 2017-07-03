/**
 * 请求发送者：遥控器
 *
 * @author zengrong.gzr
 * @date 2017/07/04
 */
public class Controller {
    private Command openCommand;
    private Command closeCommand;
    private Command changeCommand;

    public Controller(Command openCommand, Command closeCommand, Command changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }

    public void on() {
        openCommand.execute();
    }

    public void off() {
        closeCommand.execute();
    }

    public void changeChannel() {
        changeCommand.execute();
    }
}
