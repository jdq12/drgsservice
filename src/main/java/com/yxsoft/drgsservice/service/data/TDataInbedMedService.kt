package com.yxsoft.drgsservice.service.data

import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.data.TDataInbedMed

interface TDataInbedMedService : IService<TDataInbedMed> {


    fun getMedById(Id: Int): TDataInbedMed?

    fun SaveDataInbedMed(med: TDataInbedMed): List<String>

//    fun checkMed(med: TDataInbedMed)
}
