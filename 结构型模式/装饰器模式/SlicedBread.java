/**
 * 具体组件角色(ConcreteComponent):面包片
 *
 * @author zengrong.gzr
 * @date 2017/07/11
 */
public class SlicedBread extends Ingredient {

    public SlicedBread(String desc, double cost) {
        this.description = desc;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }

}
