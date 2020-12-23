package com.yxsoft.drgsservice.service.dic

import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.dic.TDicAdrg
import com.yxsoft.drgsservice.entity.dic.TDicAdrgList

interface DicAdrgListService : IService<TDicAdrgList> {
    fun selectDicDrgsByAdrgId(adrgId: Int): List<TDicAdrg>?

    fun getAdrgTypeList(): List<String>?
}
