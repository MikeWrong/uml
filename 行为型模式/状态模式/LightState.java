/**
 * 抽象状态(State)角色：电灯状态
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public interface LightState {
    void pressSwitch(LightContext light);
}
