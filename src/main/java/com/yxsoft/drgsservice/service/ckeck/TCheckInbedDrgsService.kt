package com.yxsoft.drgsservice.service.ckeck

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.check.TCheckInbedDrgs
import com.yxsoft.drgsservice.entity.data.TDataInbedMed
import org.apache.ibatis.annotations.Param

interface TCheckInbedDrgsService : IService<TCheckInbedDrgs> {
    fun getCheckInbedDrgs(page: IPage<TCheckInbedDrgs>, query: QueryWrapper<TCheckInbedDrgs>): IPage<Any>?

    fun getGroupDetailList(page: IPage<Any>, @Param("ew") query: QueryWrapper<Any>): IPage<Any>?

    fun getGroupDetailListResult(groupCode:String):HashMap<String,Any>?
}
