/**
 * 客户端
 *
 * @author zengrong.gzr
 * @date 2017/07/11
 */
public class Client {
    public static void main(String[] args) {
        Ingredient lettuce = new Lettuce("生菜", 1, new SlicedBread("面包片", 0.5));
        Ingredient egg = new Egg("鸡蛋", 1, lettuce);
        //培根鸡蛋生菜三明治
        Ingredient sandwich = new Baconic("培根", 3, egg);
        System.out.println(sandwich.getDescription());
        System.out.println("Sandwich's price is " + sandwich.getCost());

    }
}
