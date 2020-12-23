package com.yxsoft.drgsservice.dao.reg

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.yxsoft.drgsservice.entity.reg.TRegDep
import com.yxsoft.drgsservice.entity.reg.TRegDoctor
import com.yxsoft.drgsservice.entity.sys.TSysDepDoctor
import org.apache.ibatis.annotations.Param
import java.math.BigDecimal

interface RegDepDao : BaseMapper<TRegDep> {
    fun selectAll(): List<TRegDep>
    fun showDoctor(depId: BigDecimal): List<TRegDoctor>

    // liubin  DAO 层使用分页查询
    fun getDoctors(page: IPage<TRegDoctor>, depId: Int): IPage<TRegDoctor>?
    // hjj 添加医生挂载科室
    fun insertDoctorToDep(tSysDepDoctor: TSysDepDoctor): Int?
    // hjj 取消医生挂载科室
    fun deleteDoctorToDep(tSysDepDoctor : TSysDepDoctor): Int?
    // hjj 查询医生和科室信息
    fun getTRegDoctors(page: IPage<TRegDep>, @Param("ew") query: QueryWrapper<TRegDoctor>, @Param("depId") depId: Int): IPage<Any>?
     fun getAllRegs(page: IPage<TRegDep>): IPage<TRegDep>?


}