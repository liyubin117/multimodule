import com.alibaba.fastjson.JSONObject;
import com.lyb.Test;

/**
 * @author liyubin
 * @version 1.0
 * @company Netease
 * @description TODO
 */
public class ConnectorTest {
    public static void main(String[] args) {
        Test.main(new String[]{"a","b"});

        System.out.println(JSONObject.parseObject("{\"k1\":\"v1\",\"k2\":10}"));


    }
}
