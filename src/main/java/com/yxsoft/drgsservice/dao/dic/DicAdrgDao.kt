package com.yxsoft.drgsservice.dao.dic

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.dic.TDicAdrg
import com.yxsoft.drgsservice.entity.dic.TDicAdrgList

interface DicAdrgDao : BaseMapper<TDicAdrg> {
    fun selectDrgsListByAdrgId(adrgId: Int): List<TDicAdrgList>?

    fun getAdrgTypeList(): List<String>?
}
