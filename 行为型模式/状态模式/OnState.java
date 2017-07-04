/**
 * 具体状态(ConcreteState)角色：开状态
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class OnState implements LightState {
    /**
     * 在开状态下，按下开关则切换到关的状态。
     *
     * @param light
     */
    @Override
    public void pressSwitch(LightContext light) {
        System.out.println("Turn off the light.");
        light.setState(new OffState());
    }
}
