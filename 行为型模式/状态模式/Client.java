/**
 * 客户端
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class Client {
    public static void main(String[] args) {
        // 初始化电灯，原始状态为关
        LightContext light = new LightContext(new OffState());

        // 第一次按下开关，打开电灯
        light.pressSwitch();
        // 第二次按下开关，关闭电灯
        light.pressSwitch();
    }
}
