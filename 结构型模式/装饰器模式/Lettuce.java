/**
 * 具体装饰器角色(ConcreteDecorator):生菜
 *
 * @author zengrong.gzr
 * @date 2017/07/11
 */
public class Lettuce extends Decorator {
    public Lettuce(String desc, double cost, Ingredient igd) {
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
