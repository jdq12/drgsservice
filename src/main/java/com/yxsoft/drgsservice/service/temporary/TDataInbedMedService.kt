package com.yxsoft.drgsservice.service.temporary

import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.temporary.DataInbedMed

interface TDataInbedMedService : IService<DataInbedMed> {
    fun calcData(med: DataInbedMed):HashMap<String, Any>?
}
