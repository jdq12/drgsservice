package com.yxsoft.drgsservice.service.dic.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.dic.DicAdrgListDao
import com.yxsoft.drgsservice.entity.dic.TDicAdrg
import com.yxsoft.drgsservice.entity.dic.TDicAdrgList
import com.yxsoft.drgsservice.service.dic.DicAdrgListService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class DicAdrgListServiceImpl : ServiceImpl<DicAdrgListDao, TDicAdrgList>(), DicAdrgListService {
    @Autowired
    val dicAdrgListDao: DicAdrgListDao? = null
    override fun selectDicDrgsByAdrgId(adrgId: Int): List<TDicAdrg>? {
        return dicAdrgListDao?.selectDicDrgsByAdrgId(adrgId)
    }

    override fun getAdrgTypeList(): List<String>? {
        return dicAdrgListDao?.getAdrgTypeList()
    }


}
