/**
 * 具体策略类：坐公交上班
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class BicycleStrategy implements TransportStrategy {
    @Override
    public void transportAlgorithm() {
        System.out.println("ride to work.");
    }
}
