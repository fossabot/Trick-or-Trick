import java.awt.*;

/**
 * 弹出菜单类
 *
 * @author MrYaoxx
 */

public class TrickMenu extends PopupMenu {
    /**
     * 构造掏出菜单
     */
    public TrickMenu() {
        // 退出按钮
        MenuItem exitItem = new MenuItem("Exit");

        // 退出
        exitItem.addActionListener(
                e -> {
                    // 退出
                    System.exit(0);
                });

        add(exitItem);
    }
}
