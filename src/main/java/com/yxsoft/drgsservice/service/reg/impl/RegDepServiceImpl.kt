package com.yxsoft.drgsservice.service.reg.impl

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.reg.RegDepDao
import com.yxsoft.drgsservice.entity.reg.TRegDep
import com.yxsoft.drgsservice.entity.reg.TRegDoctor
import com.yxsoft.drgsservice.entity.sys.TSysDepDoctor
import com.yxsoft.drgsservice.entity.sys.TSysOrg
import com.yxsoft.drgsservice.service.reg.RegDepService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal

@Transactional
@Service
class RegDepServiceImpl : ServiceImpl<RegDepDao, TRegDep>(), RegDepService {
    @Autowired
    val regDepDao: RegDepDao? = null
    override fun showDocResult(depId: BigDecimal): List<TRegDoctor>? {
        return regDepDao?.showDoctor(depId)
    }

    override fun getDoctors(page: IPage<TRegDoctor>, depId: Int): IPage<TRegDoctor>? {
        return regDepDao?.getDoctors(page, depId)
    }

    override fun getselectAll(): List<TRegDep>? {
        return regDepDao?.selectAll()
    }

    //分页
    override fun getPageList(current: Int, size: Int): IPage<TRegDep>? {
        // 创建分页拦截器实例
        val page: IPage<TRegDep> = Page(current.toLong(), size.toLong())
        // 查询
        return regDepDao?.selectPage(page, null)
    }

    override fun insertDoctorToDep(tSysDepDoctor: TSysDepDoctor): Int? {
        return regDepDao?.insertDoctorToDep(tSysDepDoctor)
    }

    override fun deleteDoctorToDep(tSysDepDoctor: TSysDepDoctor): Int? {
        return regDepDao?.deleteDoctorToDep(tSysDepDoctor)

    }

    override fun getTRegDoctors(page: IPage<TRegDep>, query: QueryWrapper<TRegDoctor>, depId: Int): IPage<Any>? {
        return regDepDao?.getTRegDoctors(page, query,depId)
    }

    override fun getDepsInfo(Page: IPage<TRegDep>): IPage<TRegDep>?{
        return  regDepDao?.getAllRegs(Page)
    }


}
