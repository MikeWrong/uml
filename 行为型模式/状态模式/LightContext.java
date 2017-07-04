/**
 * 环境(Context)角色：电灯类
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class LightContext {
    private LightState state;

    public LightContext(LightState state) {
        this.state = state;
    }

    /**
     * 按下电灯开关
     */
    public void pressSwitch() {
        state.pressSwitch(this);
    }

    public LightState getState() {
        return state;
    }

    public void setState(LightState state) {
        this.state = state;
    }
}
