package com.yxsoft.drgsservice.service.dic

import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.dic.TDicRemoveGroup
import com.yxsoft.drgsservice.entity.dic.TDicRemoveList

interface DicRemoveGroupService : IService<TDicRemoveGroup> {
    fun getRemoveGroupListById(page: IPage<TDicRemoveList>, mccId: Int): IPage<TDicRemoveList>?
}
