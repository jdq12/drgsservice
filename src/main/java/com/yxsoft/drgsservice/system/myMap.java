package com.yxsoft.drgsservice.system;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.api.R;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class myMap implements IPage<R>, Map<String, Object> {
    public  IPage<T> toPage(){
        Long pageCurrent=((if (.contains("pageCurrent")) get("pageCurrent") else 1).toLong()
        Long pageSize=((if (keys.contains("pageSize")) get("pageSize") else 10) as Int).toLong()
        return Page(pageCurrent, pageSize)
    }
}
