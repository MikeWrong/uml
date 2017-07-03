/**
 * 请求的receiver：电视机
 *
 * @author zengrong.gzr
 * @date 2017/07/04
 */
public class Television {
    /**
     * 开电视
     */
    public void on() {
        System.out.println("The television is on.");
    }

    /**
     * 关电视
     */
    public void off() {
        System.out.println("The television is off.");
    }

    /**
     * 切换频道
     */
    public void changeChannel() {
        System.out.println("The television's channel has changed.");
    }
}
