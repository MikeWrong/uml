/**
 * 具体命令类：打开电视机
 *
 * @author zengrong.gzr
 * @date 2017/07/04
 */
public class TVOpenCommand implements Command {
    private Television television;

    public TVOpenCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();
    }
}
