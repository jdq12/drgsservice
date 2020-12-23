package com.yxsoft.drgsservice.dao.data

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.data.TDataInbedOper

interface TDataInbedOperDao : BaseMapper<TDataInbedOper> {
    fun delOper(medId: Int)
}
