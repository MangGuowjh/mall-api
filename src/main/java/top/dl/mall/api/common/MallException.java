package top.dl.mall.api.common;

/**
 * @description: 自定义异常
 * @author Denglin
 */
public class MallException extends RuntimeException {
    public MallException() {

    }

    public MallException(String message) {
        super(message);
    }

    /**
     * 抛出异常
     *
     * @param message 消息
     */
    public static void fail(String message) {
        throw new MallException(message);
    }
}
