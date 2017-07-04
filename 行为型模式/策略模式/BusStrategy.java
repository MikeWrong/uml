/**
 * 具体策略类：坐公交上班
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class BusStrategy implements TransportStrategy {
    @Override
    public void transportAlgorithm() {
        System.out.println("take the bus to work.");
    }
}
