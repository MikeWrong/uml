/**
 * 德国旅馆，只允许使用欧洲标准三孔插座
 * @author zengrong.gzr
 * @date 2017/07/06
 */
public class GermanHotel {
    private EuropeOutletInterface europeOutlet;

    public GermanHotel(EuropeOutletInterface europeOutlet) {
        this.europeOutlet = europeOutlet;
    }

    public void charge() {
        europeOutlet.powerWithThreeHole();
    }
}
