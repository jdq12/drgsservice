package com.yxsoft.drgsservice.dao.data

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.data.TDataInbedCheckList

interface TDataInbedCheckListDao : BaseMapper<TDataInbedCheckList> {
    fun delCheckList(medId: Int)
}
