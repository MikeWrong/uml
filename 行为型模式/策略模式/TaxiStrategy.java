/**
 * 具体策略类：乘出租上班
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class TaxiStrategy implements TransportStrategy {
    @Override
    public void transportAlgorithm() {
        System.out.println("take a taxi to work.");
    }
}
