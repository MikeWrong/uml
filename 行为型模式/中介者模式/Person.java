/**
 * 抽象同事对象
 *
 * @author zengrong.gzr
 * @date 2017/07/03
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    /**
     * 与中介联系
     *
     * @param message
     */
    public abstract void contact(String message);

    /**
     * 发出信息
     *
     * @param message
     */
    public abstract void sendMessage(String message);
}
