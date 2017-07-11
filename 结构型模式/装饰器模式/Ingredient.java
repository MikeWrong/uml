/**
 * 抽象组件角色(Component):组成三明治的成分
 *
 * @author zengrong.gzr
 * @date 2017/07/11
 */
public abstract class Ingredient {
    protected String description;

    protected double cost;

    public abstract String getDescription();

    public abstract double getCost();

    /**
     * 用到了模板方法*_*
     */
    public void printDescription() {
        System.out.println(" Name      " + this.getDescription());
        System.out.println(" Price RMB " + this.getCost());
    }
}
