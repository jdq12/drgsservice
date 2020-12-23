package com.yxsoft.drgsservice.dao.sys

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.yxsoft.drgsservice.entity.sys.TSysOrg

interface SysOrgDao : BaseMapper<TSysOrg> {
     fun getOrgsInfo(page: IPage<TSysOrg>): IPage<TSysOrg>?
}
