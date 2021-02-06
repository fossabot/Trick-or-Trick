import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * 托盘主程序
 *
 * @author MrYaoxx
 */

public class TrickTray {
    public static void main(String[] args) throws AWTException, IOException {
        // 判断系统是否支持托盘
        if (SystemTray.isSupported()) {
            // 设置
            Setting setting = new Setting(new JSONObject(FileUtils.readFileToString(new File("config.json"), "utf-8")));

            // 获取系统托盘
            SystemTray tray = SystemTray.getSystemTray();

            // 弹出菜单
            TrickMenu menu = new TrickMenu();

            // 托盘图标
            TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage(setting.icon), setting.title, menu);

            // 添加图标
            tray.add(trayIcon);

            // 添加脚本
            TrickRobot robot = new TrickRobot(setting);
        } else {
            System.out.println("系统不支持托盘");
        }
    }
}
