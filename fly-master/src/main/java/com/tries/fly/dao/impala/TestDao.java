package com.tries.fly.dao.impala;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;

public interface TestDao {
    JSONObject getUser();
}
