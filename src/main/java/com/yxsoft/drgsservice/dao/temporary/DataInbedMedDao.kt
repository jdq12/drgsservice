package com.yxsoft.drgsservice.dao.temporary

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.temporary.DataInbedMed

interface DataInbedMedDao : BaseMapper<DataInbedMed>{
    fun deleteInbedMed():Int
    fun deleteInbeDiag():Int
    fun deleteInbeOpList():Int

    fun callProcedure(map:Map<String,Any>)

    fun groupingCalculatedResult(groupCode: String):HashMap<String,Any>?

}
