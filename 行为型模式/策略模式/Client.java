/**
 * 客户端
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class Client {
    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        TransportStrategy transportStrategy = new BicycleStrategy();
        //创建环境
        ProgrammerContext programmerContext = new ProgrammerContext(transportStrategy);
        //去上班
        programmerContext.gotoWork();
    }
}
