package com.yxsoft.drgsservice.dao.data

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.data.TDataInbedIcuList

interface TDataInbedIcuListDao : BaseMapper<TDataInbedIcuList> {
    fun delIcuList(medId: Int)
}
