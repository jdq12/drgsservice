package com.yxsoft.drgsservice.dao.data

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.data.TDataInbedOperList

interface TDataInbedOperListDao : BaseMapper<TDataInbedOperList> {
    fun delOperList(medId: Int)
}
