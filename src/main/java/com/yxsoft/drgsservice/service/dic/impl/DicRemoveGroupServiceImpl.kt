package com.yxsoft.drgsservice.service.dic.impl

import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.dic.DicRemoveGroupDao
import com.yxsoft.drgsservice.entity.dic.TDicRemoveGroup
import com.yxsoft.drgsservice.entity.dic.TDicRemoveList
import com.yxsoft.drgsservice.service.dic.DicRemoveGroupService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class DicRemoveGroupServiceImpl : ServiceImpl<DicRemoveGroupDao, TDicRemoveGroup>(), DicRemoveGroupService {

    @Autowired
    val dicRemoveGroupDao: DicRemoveGroupDao? = null

    override fun getRemoveGroupListById(page: IPage<TDicRemoveList>, mccId: Int): IPage<TDicRemoveList>? {
        return dicRemoveGroupDao?.getRemoveGroupListById(page, mccId)
    }
}
