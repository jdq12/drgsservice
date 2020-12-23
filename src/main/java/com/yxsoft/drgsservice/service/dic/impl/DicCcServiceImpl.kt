package com.yxsoft.drgsservice.service.dic.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.dic.DicCcDao
import com.yxsoft.drgsservice.entity.dic.TDicCc
import com.yxsoft.drgsservice.entity.dic.TDicRemoveList
import com.yxsoft.drgsservice.service.dic.DicCcService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class DicCcServiceImpl : ServiceImpl<DicCcDao, TDicCc>(), DicCcService {
    @Autowired
    val dicccDao: DicCcDao? = null
    override fun ShowRemoveGroupList(ccId: Long): List<TDicRemoveList>? {
        return dicccDao?.ShowRemoveGroup(ccId)

    }
}
