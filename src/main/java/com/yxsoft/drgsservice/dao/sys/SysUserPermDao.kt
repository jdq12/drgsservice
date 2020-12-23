package com.yxsoft.drgsservice.dao.sys

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.yxsoft.drgsservice.entity.sys.TSysRole
import com.yxsoft.drgsservice.entity.sys.TSysUserPerm
import java.math.BigDecimal

interface SysUserPermDao : BaseMapper<TSysUserPerm> {
    // wanghao:请放过这个过时的方法
    fun SelectRole(doctorId: BigDecimal?): List<TSysRole>
}
