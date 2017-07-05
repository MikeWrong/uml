/**
 * 具体观察者角色类：求职者
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class JobSeekerObserver implements Observer {
    private String name;

    public JobSeekerObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update() {
        System.out.println(name + " has get the job information.");
    }
}
