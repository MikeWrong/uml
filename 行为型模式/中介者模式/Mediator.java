/**
 * 抽象中介者
 * @author zengrong.gzr
 * @date 2017/07/03
 */
public abstract class Mediator {
    /**
     * 声明一个联络方法
     * @param message
     * @param person
     */
    public abstract void contact(String message, Person person);

    /**
     * 注册具体同事类
     * @param person
     */
    public abstract void register(Person person);
}
