import java.awt.*;

/**
 * 捣乱脚本
 *
 * @author MrYaoxx
 */

public class TrickRobot extends Robot {
    /**
     * 屏幕尺寸
     */
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * 构造捣乱脚本
     *
     * @param setting 设置
     */
    public TrickRobot(Setting setting) throws AWTException {
        new Thread(() -> {
            while (true) {
                //延迟
                App.robotDelay(this, App.randomBetween(setting.minDelay, setting.maxDelay));

                // 随意移动鼠标
                int cnt = setting.mouseMoveCount;
                for (int i = 0; i < cnt; i++) {
                    mouseMove(App.randomBetween(0, screenSize.width), App.randomBetween(0, screenSize.height));
                }
            }
        }).start();
    }
}
