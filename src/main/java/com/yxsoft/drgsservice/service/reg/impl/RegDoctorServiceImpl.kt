package com.yxsoft.drgsservice.service.reg.impl

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.reg.RegDoctorDao
import com.yxsoft.drgsservice.entity.reg.TRegDep
import com.yxsoft.drgsservice.entity.reg.TRegDoctor
import com.yxsoft.drgsservice.service.reg.RegDoctorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class RegDoctorServiceImpl : ServiceImpl<RegDoctorDao, TRegDoctor>(), RegDoctorService {
    //jdq : 科室医生查询（包含模糊查询）
    @Autowired
    val regDoctor: RegDoctorDao?=null
    override fun getDoctorsAndDep(page: IPage<TRegDoctor>, query: QueryWrapper<TRegDoctor>): IPage<Any>? {
            return regDoctor?.getDoctorsAndDep(page,query)
    }


    override fun getDepsByDoctorId(doctorId: Int): List<TRegDep>? {
        return regDoctor?.getDepsByDoctorId(doctorId)
    }
//jdq  显示所以科室()
    override fun getTRegDeps(page:IPage<TRegDoctor>, query: QueryWrapper<TRegDep>, doctorId: Int): IPage<Any>? {
        return  regDoctor?.getTRegDeps(page,query,doctorId)
    }


}
