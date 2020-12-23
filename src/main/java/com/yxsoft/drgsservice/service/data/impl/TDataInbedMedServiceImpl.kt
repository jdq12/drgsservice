package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.*
import com.yxsoft.drgsservice.entity.data.TDataInbedMed
import com.yxsoft.drgsservice.service.data.*
import com.yxsoft.drgsservice.system.exception.OperationException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Transactional
@Service
class TDataInbedMedServiceImpl : ServiceImpl<TDataInbedMedDao, TDataInbedMed>(), TDataInbedMedService {

    @Autowired
    val medDao: TDataInbedMedDao? = null

    @Autowired
    val feeDao: TDataInbedFeeListDao? = null

    @Autowired
    val diagDao: TDataInbedDiagDao? = null

    @Autowired
    val operDao: TDataInbedOperDao? = null

    @Autowired
    val operListDao: TDataInbedOperListDao? = null

    @Autowired
    val checkListDao: TDataInbedCheckListDao? =null

    @Autowired
    val icuListDao: TDataInbedIcuListDao? = null

    @Autowired
    val outbedSummDao: TDataInbedOutbedSummDao? = null

    @Autowired
    val feeService: TDataInbedFeeListService? = null

    @Autowired
    val diagsService: TDataInbedDiagService? = null

    @Autowired
    val operService: TDataInbedOperService? = null

    @Autowired
    val icuListService: TDataInbedIcuListService? = null

    @Autowired
    val outbedSummService: TDataInbedOutbedSummService? = null

    @Autowired
    val chechkListService: TDataInbedCheckListService? = null

    @Autowired
    val operListService: TDataInbedOperListService? = null

    override fun getMedById(Id: Int): TDataInbedMed? {
        return medDao?.getMedById(Id)
    }

    @Transactional
    override fun SaveDataInbedMed(med: TDataInbedMed): List<String> {
//        checkMed(med);

//        val query= QueryWrapper<TDataInbedMed>().eq("STL_MED_CODE",med.stlMedCode)
//        this.list(query).size

        // 通过病案号删除主从表中的重复数据
        val isMedId = med.stlMedCode?.let { medDao?.getMedIdByStlMedCode(it) }
        if (isMedId != null) {
            if (isMedId > 0){
                medDao?.delMed(isMedId)
                diagDao?.delDiag(isMedId)
                feeDao?.delFeeList(isMedId)
                operDao?.delOper(isMedId)
                operListDao?.delOperList(isMedId)
                checkListDao?.delCheckList(isMedId)
                icuListDao?.delIcuList(isMedId)
                outbedSummDao?.delOutbedSumm(isMedId)
            }
        }

        save(med)
        // 获取主表ID，保存从表数据
        med.feeList?.forEach { it.inbedMedId = med.inbedMedId }
        feeService?.saveBatch(med.feeList)

        med.diags?.forEach { it.inbedMedId = med.inbedMedId
//            if (it.hiDiagCode == null)
//                it.hiDiagCode = it.diagCode
//            if (it.hiDiagName == null)
//                it.hiDiagName = it.diagName
        }
        diagsService?.saveBatch(med.diags)

        med.oper?.forEach { it.inbedMedId = med.inbedMedId }
        operService?.saveBatch(med.oper)

        med.oper?.forEach { oper ->
            oper.operList?.forEach {
                it.inbedOperId = oper.inbedOperId
                it.inbedMedId = med.inbedMedId
//                if(it.hiOperCode == null)
//                    it.hiOperCode = it.operCode
//                if (it.hiOperName == null)
//                    it.hiOperName = it.operName
            }
            operListService?.saveBatch(oper.operList)
        }

        med.checkList?.forEach { it.inbedMedId = med.inbedMedId }
        chechkListService?.saveBatch(med.checkList)

        med.icuList?.forEach { it.inbedMedId = med.inbedMedId }
        icuListService?.saveBatch(med.icuList)

        med.outbedSumm?.forEach { it.inbedMedId = med.inbedMedId }
        outbedSummService?.saveBatch(med.outbedSumm)

        //wanghao : 调用有返回值的储存过程函数时，使用以下方法
        //创建一个map存放入参和返参，返参初始值为空
        val map = mutableMapOf<String, Any>()
        map["medId"] = med.inbedMedId!!.toString()
        map["result"] = ""
//        val callProcedure = medDao?.callProcedure(med.inbedMedId!!.toInt())
        medDao?.callProcedure(map)
//        println(med.inbedMedId)
        return map["result"].toString().split("|")
//        val resultList = result.split("|")
//        println(resultList[0]+"|"+resultList[1])
//        println(map["resultCode"])
//        return resultList
    }

    //wanghao:检查业务逻辑异常
    //未写完
//    override fun checkMed(med: TDataInbedMed) {
////       if ( med.operId<=0) throw OperationException("fasfa")
//
//        med.icuList?.forEach { icu ->
//            icuListService?.checkIcuList(icu)
//        }
//    }

}


