package com.yxsoft.drgsservice.dao.dic

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.yxsoft.drgsservice.entity.dic.TDicMdc

interface DicMdcDao : BaseMapper<TDicMdc> {
     fun getdrg(page: IPage<TDicMdc>): IPage<TDicMdc>?
}
