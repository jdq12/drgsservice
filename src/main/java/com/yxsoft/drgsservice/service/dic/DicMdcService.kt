package com.yxsoft.drgsservice.service.dic

import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.dic.TDicMdc
import com.yxsoft.drgsservice.entity.reg.TRegDep

interface DicMdcService : IService<TDicMdc> {
     fun getDrgInfo(Page: IPage<TDicMdc>): IPage<TDicMdc>?
}
