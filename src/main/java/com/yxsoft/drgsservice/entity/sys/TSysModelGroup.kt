package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.math.BigDecimal

data class TSysModelGroup(
        @TableId(type = IdType.AUTO)
        val modelGroupId: BigDecimal? = null,
        val modelGroupCode: String? = null,
        val modelGroupName: String? = null,
        val orderBy: Long? = null,
        val note: String? = null,
        val status: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null

) : Serializable
