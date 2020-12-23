package com.yxsoft.drgsservice.service.dic.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.dic.DicAdrgDao
import com.yxsoft.drgsservice.entity.dic.TDicAdrg
import com.yxsoft.drgsservice.entity.dic.TDicAdrgList
import com.yxsoft.drgsservice.service.dic.DicAdrgService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service

// liubin
// 从ServiceImpl  继承服务实现类 注意书写格式
// ServiceImpl<对应的Dao,对应的Entity>(), 对应的Service
class DicAdrgServiceImpl : ServiceImpl<DicAdrgDao, TDicAdrg>(), DicAdrgService {
    @Autowired
    val dicAdrgDao: DicAdrgDao? = null

    override fun selectDrgsListByAdrgId(adrgId: Int): List<TDicAdrgList>? {
        return dicAdrgDao?.selectDrgsListByAdrgId(adrgId)
    }

    override fun getAdrgTypeList(): List<String>? {
        return dicAdrgDao?.getAdrgTypeList()
    }

}
