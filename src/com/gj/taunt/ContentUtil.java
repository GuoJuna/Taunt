package com.gj.taunt;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.List;
import java.util.Map;

public class ContentUtil {

    public static String getContent(){
        String rs = HttpUtil.get("https://api.nextrt.com/V1/Dutang");
        JSONObject parse = JSONUtil.parseObj(rs);
        List data = (List) parse.get("data");
        Map map = (Map) data.get(0);
        String content = (String) map.get("content");
        return content;
    }
}
