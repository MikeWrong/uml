/**
 * 具体同事对象：租房者
 * @author zengrong.gzr
 * @date 2017/07/03
 */
public class Tenant extends Person {
    Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String message) {
        mediator.contact(message, this);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("租房者:" + name + ",获得信息：" + message);
    }
}
