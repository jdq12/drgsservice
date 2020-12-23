package com.yxsoft.drgsservice.service.dic

import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.dic.TDicCc
import com.yxsoft.drgsservice.entity.dic.TDicRemoveList

interface DicCcService : IService<TDicCc> {
    fun ShowRemoveGroupList(ccID: Long): List<TDicRemoveList>?

}
