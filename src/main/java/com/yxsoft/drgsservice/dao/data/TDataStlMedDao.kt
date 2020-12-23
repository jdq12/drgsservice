package com.yxsoft.drgsservice.dao.data

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.data.TDataStlMed

interface TDataStlMedDao : BaseMapper<TDataStlMed> {
    abstract fun getMedById(id: Int): TDataStlMed?

}
