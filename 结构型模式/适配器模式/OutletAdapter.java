/**
 * 适配器类(Adapter)：将双孔插座转换成三孔插座进行充电
 *
 * @author zengrong.gzr
 * @date 2017/07/06
 */
public class OutletAdapter implements EuropeOutletInterface {
    private ChinaOutlet chinaOutlet;

    public OutletAdapter(ChinaOutlet chinaOutlet) {
        this.chinaOutlet = chinaOutlet;
    }

    @Override
    public void powerWithThreeHole() {
        System.out.println("使用电源转换器将双孔插座转换为三孔插座");
        chinaOutlet.powerWithTwoHole();
    }
}
