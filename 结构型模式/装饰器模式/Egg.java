/**
 * 具体装饰器角色(ConcreteDecorator):鸡蛋
 *
 * @author zengrong.gzr
 * @date 2017/07/11
 */
public class Egg extends Decorator {
    public Egg(String desc, double cost, Ingredient igd) {
        super(igd);
        this.description = desc;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        String base = ingredient.getDescription();
        return base + "\n" + "Decorator with " + description + "!";
    }

    @Override
    public double getCost() {
        return ingredient.getCost() + cost;
    }
}
