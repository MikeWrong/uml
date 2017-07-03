/**
 * 具体命令类：切换频道
 *
 * @author zengrong.gzr
 * @date 2017/07/04
 */
public class TVChangeCommand implements Command{
    private Television television;

    public TVChangeCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.changeChannel();
    }
}
