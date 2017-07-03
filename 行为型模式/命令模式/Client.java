/**
 * 客户端
 *
 * @author zengrong.gzr
 * @date 2017/07/04
 */
public class Client {
    public static void main(String[] args) {
        // 命令接收者Receiver
        Television tv = new Television();
        //开机命令
        Command on = new TVOpenCommand(tv);
        //关机命令
        Command off = new TVCloseCommand(tv);
        //切换频道命令
        Command change = new TVChangeCommand(tv);

        //命令控制对象Invoker
        Controller controller = new Controller(on, off, change);

        // 开机
        controller.on();
        // 切换频道
        controller.changeChannel();
        // 关机
        controller.off();
    }
}
