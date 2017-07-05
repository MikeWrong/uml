/**
 * 客户端
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class Client {
    public static void main(String[] args) {
        //创建主题对象公司
        CompanySubject companySubject = new CompanySubject();
        //将求职者注册到公司
        companySubject.attach(new JobSeekerObserver("Tom"));
        companySubject.attach(new JobSeekerObserver("Jack"));
        //发布用工需求
        companySubject.publishEmploymentNeeds("A programmer is needed.");
    }
}
