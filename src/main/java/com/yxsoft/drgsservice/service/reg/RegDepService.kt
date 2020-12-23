package com.yxsoft.drgsservice.service.reg

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.reg.TRegDep
import com.yxsoft.drgsservice.entity.reg.TRegDoctor
import com.yxsoft.drgsservice.entity.sys.TSysDepDoctor
import com.yxsoft.drgsservice.entity.sys.TSysOrg
import java.math.BigDecimal

interface RegDepService : IService<TRegDep> {

    fun showDocResult(depId: BigDecimal): List<TRegDoctor>?
    fun getDoctors(page: IPage<TRegDoctor>, depId: Int): IPage<TRegDoctor>?

    fun getselectAll(): List<TRegDep>?
    fun getPageList(current: Int, size: Int): IPage<TRegDep>?
    // hjj 医生挂载科室
    fun insertDoctorToDep(tSysDepDoctor : TSysDepDoctor): Int?
    // hjj 医生取消挂载科室
    fun deleteDoctorToDep(tSysDepDoctor : TSysDepDoctor): Int?
    //jdq显示全部医生
    fun getTRegDoctors(page: IPage<TRegDep>, query: QueryWrapper<TRegDoctor>, depId: Int): IPage<Any>?
    //所有科室信息(code与name)
     fun getDepsInfo(Page: IPage<TRegDep>): IPage<TRegDep>?


}
