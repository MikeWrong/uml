/**
 * 环境类：程序员如何上班
 * 算法解决类，以提供客户选择使用何种解决方案
 *
 * @author zengrong.gzr
 * @date 2017/07/05
 */
public class ProgrammerContext {
    private TransportStrategy transportStrategy;

    public ProgrammerContext(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    /**
     * 去上班
     */
    public void gotoWork() {
        transportStrategy.transportAlgorithm();
    }
}
