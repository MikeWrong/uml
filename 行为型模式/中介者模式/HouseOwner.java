/**
 * 具体同事对象：房主
 * @author zengrong.gzr
 * @date 2017/07/03
 */
public class HouseOwner extends Person {
    HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String message) {
        mediator.contact(message, this);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("房主:" + name + ",获得信息：" + message);
    }
}
