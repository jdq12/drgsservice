package com.yxsoft.drgsservice.dao.data

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.data.TDataInbedMed
import org.apache.ibatis.annotations.Param

interface TDataInbedMedDao : BaseMapper<TDataInbedMed> {

    fun getMedById(Id: Int): TDataInbedMed?

    // wanghao:调用有返回值的储存过程函数时
    fun callProcedure(map: Map<String, Any>)

    fun getMedIdByStlMedCode(stlMedCode:String):Int?

    fun delMed(medId:Int)
}
