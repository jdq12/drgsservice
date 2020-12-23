package com.yxsoft.drgsservice.dao.data

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.data.TDataInbedDiag

interface TDataInbedDiagDao : BaseMapper<TDataInbedDiag> {
    fun delDiag(medId: Int)
}
