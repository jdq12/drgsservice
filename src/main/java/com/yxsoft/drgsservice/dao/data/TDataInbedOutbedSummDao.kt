package com.yxsoft.drgsservice.dao.data

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.data.TDataInbedOutbedSumm

interface TDataInbedOutbedSummDao : BaseMapper<TDataInbedOutbedSumm> {
    fun delOutbedSumm(medId: Int)
}
