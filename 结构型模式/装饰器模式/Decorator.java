/**
 * 抽象装饰器(Decorator):装饰器对象
 *
 * @author zengrong.gzr
 * @date 2017/07/11
 */
public abstract class Decorator extends Ingredient {
    Ingredient ingredient;

    public Decorator(Ingredient igd) {
        this.ingredient = igd;
    }
}
