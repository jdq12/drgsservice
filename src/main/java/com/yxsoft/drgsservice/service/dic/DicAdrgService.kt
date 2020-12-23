package com.yxsoft.drgsservice.service.dic


import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.dic.TDicAdrg
import com.yxsoft.drgsservice.entity.dic.TDicAdrgList

// liubin
// 从 IService 继承，范型使用对应的 Entity
interface DicAdrgService : IService<TDicAdrg> {
    fun selectDrgsListByAdrgId(adrgId: Int): List<TDicAdrgList>?

    fun getAdrgTypeList(): List<String>?
}
