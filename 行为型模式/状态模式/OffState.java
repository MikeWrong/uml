/**
 * 具体状态(ConcreteState)角色：关状态
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class OffState implements LightState {
    /**
     * 在关状态下，按下开关则切换到开的状态。
     * @param light
     */
    @Override
    public void pressSwitch(LightContext light) {
        System.out.println("Turn on the light.");
        light.setState(new OnState());
    }
}
