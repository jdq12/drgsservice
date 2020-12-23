package com.yxsoft.drgsservice.dao.dic

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.yxsoft.drgsservice.entity.dic.TDicRemoveGroup
import com.yxsoft.drgsservice.entity.dic.TDicRemoveList

interface DicRemoveGroupDao : BaseMapper<TDicRemoveGroup> {
    fun getRemoveGroupListById(page: IPage<TDicRemoveList>, mccId: Int): IPage<TDicRemoveList>?

}
