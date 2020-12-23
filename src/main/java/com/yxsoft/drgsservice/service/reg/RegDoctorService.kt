package com.yxsoft.drgsservice.service.reg

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.IService
import com.yxsoft.drgsservice.entity.reg.TRegDep
import com.yxsoft.drgsservice.entity.reg.TRegDoctor

interface RegDoctorService : IService<TRegDoctor> {

    //jdq 得到全部对应医生科室信息
    fun getDoctorsAndDep(page: IPage<TRegDoctor>, query: QueryWrapper<TRegDoctor>): IPage<Any>?

    fun getDepsByDoctorId(doctorId:Int): List<TRegDep>?

    //jdq 显示全部科室
    fun getTRegDeps(page: IPage<TRegDoctor>, wrapper: QueryWrapper<TRegDep>, doctorId: Int): IPage<Any>?
}
