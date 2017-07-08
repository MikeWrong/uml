/**
 * ���ģʽ��ͬ�������·ŵ�if�ڲ��������ִ�е�Ч�ʣ�����ÿ�λ�ȡ����ʱ������ͬ����ֻ�е�һ�β�ͬ�����������Ժ��û��Ҫ�ˡ�
 * ����ģʽ��˫���жϼ�ͬ���ķ�ʽ��������ʽ��Ч�ʴ����������Ϊ�������if�жϣ��ڷ��������������£�
 * ������һ�ٸ��̣߳��ķѵ�ʱ��Ϊ100*��ͬ���ж�ʱ��+if�ж�ʱ�䣩�������˫��if�жϣ�100���߳̿���ͬʱif�жϣ��������ĵ�ʱ��ֻ��һ��if�жϵ�ʱ�䡣
 * ���������Ը߲�������������Ҳ��õ�������ģʽ����õ�ѡ�����˫���жϼ�ͬ���ķ�ʽ��
 *
 * @author zengrong.gzr
 * @date 2017/07/09
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
