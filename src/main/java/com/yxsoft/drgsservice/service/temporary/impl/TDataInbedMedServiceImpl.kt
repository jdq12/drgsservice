package com.yxsoft.drgsservice.service.temporary.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.temporary.DataInbedMedDao
import com.yxsoft.drgsservice.entity.temporary.DataInbedMed
import com.yxsoft.drgsservice.service.temporary.TDataInbedDiagService
import com.yxsoft.drgsservice.service.temporary.TDataInbedMedService
import com.yxsoft.drgsservice.service.temporary.TDataInbedOperListService
import com.yxsoft.drgsservice.system.exception.OperationException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service("DataInbedMedServiceImpl")
class TDataInbedMedServiceImpl : ServiceImpl<DataInbedMedDao,DataInbedMed>(), TDataInbedMedService {

    @Autowired
    val diagsService: TDataInbedDiagService? = null

    @Autowired
    val operListService: TDataInbedOperListService? = null

    @Autowired
    val tDataInbedMedDao:DataInbedMedDao? = null

    override fun calcData(med: DataInbedMed): HashMap<String, Any>? {
        save(med)

        println(med.diags)

        med.diags?.forEach { it.inbedMedId = med.inbedMedId }
        diagsService?.saveBatch(med.diags)

        med.operList?.forEach { it.inbedMedId = med.inbedMedId }
        operListService?.saveBatch(med.operList)

        //  调用测算函数进行测算
        val map = mutableMapOf<String, Any>()
        map["medId"] = med.inbedMedId!!.toString()
        map["result"] = ""
        tDataInbedMedDao?.callProcedure(map)
        val result = map["result"]
        if (result != "-1"){
           return tDataInbedMedDao?.groupingCalculatedResult(result.toString())
        }
        throw OperationException("输入错误，请重新测算")
    }

}
