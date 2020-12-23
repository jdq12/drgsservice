package com.yxsoft.drgsservice.dao.sys

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.yxsoft.drgsservice.entity.check.TCheckInbedDrgs
import com.yxsoft.drgsservice.entity.sys.TSysUser
import org.apache.ibatis.annotations.CacheNamespace
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.cache.impl.PerpetualCache

// liubin
// 开启二级缓存 (先默认使用 PerpetualCache，后续再优化)
@CacheNamespace(implementation = PerpetualCache::class)
interface SysUserDao : BaseMapper<TSysUser> {
    fun login(username: String): TSysUser

    fun getUserInfo(userCode: String): TSysUser

    fun getPageList(page: IPage<TSysUser>, @Param("ew") query: QueryWrapper<TSysUser>): IPage<Any>?
}
