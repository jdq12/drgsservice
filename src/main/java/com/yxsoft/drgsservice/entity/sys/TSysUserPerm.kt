package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import com.yxsoft.drgsservice.entity.reg.TRegDoctor
import java.io.Serializable
import java.math.BigDecimal

data class TSysUserPerm(
        val doctorId: BigDecimal? = null,
        val roleId: BigDecimal? = null,

        @Transient
        val doctor: List<TRegDoctor>? = null, //医生列表

        @Transient
        val role: List<TSysRole>? = null, // 角色列表
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null
) : Serializable
