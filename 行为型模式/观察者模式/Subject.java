import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色类
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public abstract class Subject {
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> jobSeekers = new ArrayList<>();

    /**
     * 注册观察者对象
     *
     * @param observer
     */
    public void attach(Observer observer) {
        jobSeekers.add(observer);
        System.out.println("Attached an observer.");
    }

    /**
     * 删除观察者对象
     *
     * @param observer
     */
    public void detach(Observer observer) {
        jobSeekers.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    public void notifyObservers() {
        for (Observer jobSeeker : jobSeekers) {
            jobSeeker.update();
        }
    }
}
