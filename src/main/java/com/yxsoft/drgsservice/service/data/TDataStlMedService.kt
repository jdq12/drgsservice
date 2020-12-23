package com.yxsoft.drgsservice.service.data

import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.data.TDataStlMed

interface TDataStlMedService : IService<TDataStlMed> {
    fun getMedById(id: Int): TDataStlMed?
    fun SaveDataStlMed(med: TDataStlMed): Boolean

}
