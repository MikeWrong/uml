/**
 * @author zengrong.gzr
 * @date 2017/07/08
 */
public abstract class Handler {
    /**
     * 下一个处理请求的对象
     */
    protected Handler superior = null;

    /**
     * 职位
     */
    protected String position;

    /**
     * 能处理的最大审批经费
     */
    protected int limit;

    public Handler getSuperior() {
        return superior;
    }

    public void setSuperior(Handler superior) {
        this.superior = superior;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * 处理团建费用申请
     *
     * @param request
     * @return
     */
    public void handleOutingFeeRequest(OutingFeeRequest request) {
        if (getLimit() > request.getRequestFee()) {
            System.out.println(getPosition() + "同意团建经费申请");
        } else {
            if (superior != null) {
                superior.handleOutingFeeRequest(request);
            } else {
                System.out.println("没有人能审批这么大金额的经费申请！");
            }
        }
    }

}
