package com.yxsoft.drgsservice.service.ckeck.impl

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.check.TCheckInbedDrgsDao
import com.yxsoft.drgsservice.dao.temporary.DataInbedMedDao
import com.yxsoft.drgsservice.entity.check.TCheckInbedDrgs
import com.yxsoft.drgsservice.service.ckeck.TCheckInbedDrgsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TCheckInbedDrgsServiceImpl : ServiceImpl<TCheckInbedDrgsDao, TCheckInbedDrgs>(), TCheckInbedDrgsService {

    @Autowired
    val tCkeckInberDrgsDao: TCheckInbedDrgsDao? = null

    @Autowired
    val DataInbedMedDao:DataInbedMedDao? = null

    //wanghao:自定义sql使用MyBatis plus分页
    override fun getCheckInbedDrgs(page: IPage<TCheckInbedDrgs>, query: QueryWrapper<TCheckInbedDrgs>): IPage<Any>? {
//        println(query.sqlSegment)
        return tCkeckInberDrgsDao?.getCheckInbedDrgs(page, query)
    }

    override fun getGroupDetailList(page: IPage<Any>, query: QueryWrapper<Any>): IPage<Any>? {
        return tCkeckInberDrgsDao?.getGroupDetailList(page,query)
    }

    override fun getGroupDetailListResult(groupCode: String): HashMap<String, Any>? {
        // 清空临时表所有数据
        DataInbedMedDao?.deleteInbeDiag()
        DataInbedMedDao?.deleteInbeOpList()
        DataInbedMedDao?.deleteInbedMed()
        return tCkeckInberDrgsDao?.groupingCalculatedResult(groupCode)
    }

//    override fun getGroupDetailListResult(medId: Int): HashMap<String, Any>? {
//        val map = mutableMapOf<String, Any>()
//        map["medId"] = medId.toString()
//        map["result"] = ""
//        tCkeckInberDrgsDao?.callProcedure(map)
//        val result = map["result"]
//        if (result != "-1"){
//           return tCkeckInberDrgsDao?.groupingCalculatedResult(result.toString())
//        }
//        throw OperationException("输入错误，请重新测算")
//    }


}
