/**
 * 客户端
 *
 * @author zengrong.gzr
 * @date 2017/07/06
 */
public class Client {
    public static void main(String[] args) {
        //初始化中国标准双孔插座
        ChinaOutlet chinaOutlet = new ChinaOutlet();
        //使用适配器将双孔插座转化为三孔插座
        OutletAdapter adapter = new OutletAdapter(chinaOutlet);
        GermanHotel hotel = new GermanHotel(adapter);
        //在旅馆中给手机充电
        hotel.charge();
    }
}
