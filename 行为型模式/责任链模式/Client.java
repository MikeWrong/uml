/**
 * 客户端
 *
 * @author zengrong.gzr
 * @date 2017/07/08
 */
public class Client {
    public static void main(String[] args) {
        //先要组装责任链
        Handler supervisor = new Supervisor();
        Handler director = new Director();
        Handler ceo = new CEO();
        supervisor.setSuperior(director);
        director.setSuperior(ceo);

        //测试
        OutingFeeRequest request = new OutingFeeRequest(100);
        supervisor.handleOutingFeeRequest(request);

        request = new OutingFeeRequest(1000);
        supervisor.handleOutingFeeRequest(request);

        request = new OutingFeeRequest(10000);
        supervisor.handleOutingFeeRequest(request);

        request = new OutingFeeRequest(100000);
        supervisor.handleOutingFeeRequest(request);
    }
}
