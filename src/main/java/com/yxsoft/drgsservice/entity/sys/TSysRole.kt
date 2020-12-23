package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.math.BigDecimal

data class TSysRole(
        @TableId(type = IdType.AUTO)
        val roleId: BigDecimal? = null,
        val roleCode: String? = null,
        val roleName: String? = null,
        val status: String? = null,
        val note: String? = null,
        val userCode: String? = null,
        val userName: String? = null,
        val userPwd: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null
) : Serializable
