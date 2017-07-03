/**
 * 具体命令类：关闭电视机
 *
 * @author zengrong.gzr
 * @date 2017/07/04
 */
public class TVCloseCommand implements Command {
    private Television television;

    public TVCloseCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }
}
