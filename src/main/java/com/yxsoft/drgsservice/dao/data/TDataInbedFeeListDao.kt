package com.yxsoft.drgsservice.dao.data

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.data.TDataInbedFeeList

interface TDataInbedFeeListDao : BaseMapper<TDataInbedFeeList> {
    fun delFeeList(medId: Int)
}
