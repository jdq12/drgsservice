package com.yxsoft.drgsservice.dao.dic

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.dic.TDicAdrg
import com.yxsoft.drgsservice.entity.dic.TDicAdrgList

interface DicAdrgListDao : BaseMapper<TDicAdrgList> {
    fun selectDicDrgsByAdrgId(adrgId: Int): List<TDicAdrg>?
    fun getAdrgTypeList(): List<String>?
}
