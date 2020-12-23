package com.yxsoft.drgsservice.service.dic.impl

import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.dic.DicMccDao
import com.yxsoft.drgsservice.dao.dic.DicMdcDao
import com.yxsoft.drgsservice.entity.dic.TDicMdc
import com.yxsoft.drgsservice.service.dic.DicMdcService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class DicMdcServiceImpl : ServiceImpl<DicMdcDao, TDicMdc>(), DicMdcService {
    @Autowired
    val dicMdcDao:DicMdcDao?=null
    override fun getDrgInfo(Page: IPage<TDicMdc>): IPage<TDicMdc> ?{
        return dicMdcDao?.getdrg(Page)
    }

}
