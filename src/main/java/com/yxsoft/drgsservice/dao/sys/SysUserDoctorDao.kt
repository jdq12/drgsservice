package com.yxsoft.drgsservice.dao.sys

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.reg.TRegDoctor
import com.yxsoft.drgsservice.entity.sys.TSysUserDoctor

interface SysUserDoctorDao : BaseMapper<TSysUserDoctor> {
    // wanghao:请放过这个过时的方法
    fun SelectDoctor(userCode: String): TRegDoctor
    fun insertUserToDoctor(tSysUserDoctor: TSysUserDoctor): Int?
    fun deleteUsertoDoctor(tSysUserDoctor: TSysUserDoctor): Int?

}
