/**
 * 具体中介者对象：中介结构
 * @author zengrong.gzr
 * @date 2017/07/03
 */
public class MediatorStructure extends Mediator {
    //首先中介结构必须知道所有房主和租房者的信息
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if (person == houseOwner) {
            //如果是房主，则租房者获得信息
            tenant.sendMessage(message);
        } else {
            //否则是房主获得信息
            houseOwner.sendMessage(message);
        }
    }

    @Override
    public void register(Person person) {
        if (person instanceof Tenant) {
            tenant = (Tenant)person;
        } else {
            houseOwner = (HouseOwner)person;
        }
    }
}
