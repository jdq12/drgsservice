package com.yxsoft.drgsservice.dao.reg

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.yxsoft.drgsservice.entity.reg.TRegDep
import com.yxsoft.drgsservice.entity.reg.TRegDoctor
import org.apache.ibatis.annotations.Param

interface RegDoctorDao : BaseMapper<TRegDoctor> {
    fun getDoctorsAndDep(page: IPage<TRegDoctor>, @Param("ew")query: QueryWrapper<TRegDoctor>): IPage<Any>?

    fun getDepsByDoctorId(doctorId:Int): List<TRegDep>?
    //得到全部科室信息
    fun getTRegDeps(page: IPage<TRegDoctor>, @Param("ew") query: QueryWrapper<TRegDep>, @Param("doctorId") doctorId: Int): IPage<Any>?
}
