/**
 * 这个模式将同步内容下放到if内部，提高了执行的效率，不必每次获取对象时都进行同步，只有第一次才同步，创建了以后就没必要了。
 * 这种模式中双重判断加同步的方式，比懒汉式的效率大大提升，因为如果单层if判断，在服务器允许的情况下，
 * 假设有一百个线程，耗费的时间为100*（同步判断时间+if判断时间），而如果双重if判断，100的线程可以同时if判断，理论消耗的时间只有一个if判断的时间。
 * 所以如果面对高并发的情况，而且采用的是懒汉模式，最好的选择就是双重判断加同步的方式。
 *
 * @author zengrong.gzr
 * @date 2017/07/09
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
