import org.json.JSONException;
import org.json.JSONObject;

/**
 * 设置类
 *
 * @author MrYaoxx
 */

public class Setting {
    /**
     * 托盘标题
     */
    public String title;

    /**
     * 托盘图标
     */
    public String icon;

    /**
     * 捣乱间隔时间
     */
    public Integer minDelay, maxDelay;

    /**
     * 鼠标移动速度
     */
    public Integer mouseMoveCount;

    /**
     * 构造函数
     *
     * @param json Json文件
     */
    public Setting(JSONObject json) {
        if(json.has("title"))title = (String) json.get("title");
        else title = "Trick-or-Trick";

        if(json.has("icon"))icon = (String) json.get("icon");
        else icon = "icon.png";

        if(json.has("minDelay"))minDelay = (Integer) json.get("minDelay");
        else minDelay = 600;

        if(json.has("maxDelay"))maxDelay = (Integer) json.get("maxDelay");
        else maxDelay = 600;

        if(json.has("mouseMoveCount"))mouseMoveCount = (Integer) json.get("mouseMoveCount");
        else mouseMoveCount = 100;
    }
}
