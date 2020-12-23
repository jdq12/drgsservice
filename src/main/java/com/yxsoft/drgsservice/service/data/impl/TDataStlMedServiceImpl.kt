package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataStlDiagDao
import com.yxsoft.drgsservice.dao.data.TDataStlFeeListDao
import com.yxsoft.drgsservice.dao.data.TDataStlMedDao
import com.yxsoft.drgsservice.dao.data.TDataStlOperDao
import com.yxsoft.drgsservice.entity.data.TDataStlMed
import com.yxsoft.drgsservice.service.data.TDataStlDiagService
import com.yxsoft.drgsservice.service.data.TDataStlFeeListService
import com.yxsoft.drgsservice.service.data.TDataStlMedService
import com.yxsoft.drgsservice.service.data.TDataStlOperService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDataStlMedServiceImpl : ServiceImpl<TDataStlMedDao, TDataStlMed>(), TDataStlMedService {
    @Autowired
    val stlMed: TDataStlMedDao? = null

    @Autowired
    val diag: TDataStlDiagService? = null

    @Autowired
    val operService: TDataStlOperService? = null

    @Autowired
    val feeListService: TDataStlFeeListService? = null
    override fun getMedById(id: Int): TDataStlMed? {
        return stlMed?.getMedById(id)
    }

    override fun SaveDataStlMed(med: TDataStlMed): Boolean {
        save(med)
        med.diags?.forEach {
            it.stlMedId = med.stlMedId
        }
        diag?.saveBatch(med.diags)

        med.oper?.forEach { it.stlMedId = med.stlMedId }
        operService?.saveBatch(med.oper)


        med.feeList?.forEach { it.stlMedId = med.stlMedId }
        feeListService?.saveBatch(med.feeList)
        return true
    }

}