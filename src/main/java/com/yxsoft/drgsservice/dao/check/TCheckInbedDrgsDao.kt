package com.yxsoft.drgsservice.dao.check

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.yxsoft.drgsservice.entity.check.TCheckInbedDrgs
import com.yxsoft.drgsservice.entity.data.TDataInbedMed
import org.apache.ibatis.annotations.Param

interface TCheckInbedDrgsDao : BaseMapper<TCheckInbedDrgs> {
    //wanghao:自定义sql使用MyBatis plus分页
    //ew为查询条件，返回类型为IPage(Any)
    fun getCheckInbedDrgs(page: IPage<TCheckInbedDrgs>, @Param("ew") query: QueryWrapper<TCheckInbedDrgs>): IPage<Any>?

    fun getGroupDetailList(page: IPage<Any>, @Param("ew") query: QueryWrapper<Any>): IPage<Any>?

//    fun callProcedure(map:Map<String,Any>)

    fun groupingCalculatedResult(groupCode: String):HashMap<String,Any>?

}
