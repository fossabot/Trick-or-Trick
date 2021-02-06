import java.awt.*;

/**
 * 工具类
 *
 * @author MrYaoxx
 */

public class App {
    /**
     * 脚本延迟
     *
     * @param robot  脚本机器人
     * @param second 秒数
     */
    public static void robotDelay(Robot robot, int second) {
        for (int i = 1; i <= second; i++) robot.delay(1000);
    }

    /**
     * 生成[a,b)区间内的随机数
     * @param a a
     * @param b b
     * @return [a, b)区间内的随机数
     */
    public static int randomBetween(int a, int b) {
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        } ;
        return (int) (Math.random() * (b - a) + a);
    }
}
