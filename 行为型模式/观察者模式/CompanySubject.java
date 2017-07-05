/**
 * 具体主题角色类：公司
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class CompanySubject extends Subject {
    /**
     * 发布用工需求
     */
    public void publishEmploymentNeeds(String info) {
        System.out.println(info);
        notifyObservers();
    }
}
