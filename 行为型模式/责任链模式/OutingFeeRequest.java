/**
 * 团建费用申请
 *
 * @author zengrong.gzr
 * @date 2017/07/08
 */
public class OutingFeeRequest {
    /**
     * 团建费用
     */
    private int requestFee;

    public OutingFeeRequest(int requestFee) {
        this.requestFee = requestFee;
        System.out.println("有团建费用申请，申请经费" + getRequestFee() + "元");
    }

    public int getRequestFee() {
        return requestFee;
    }

    public void setRequestFee(int requestFee) {
        this.requestFee = requestFee;
    }
}
