package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

data class TSysConfig(
        @TableId(type = IdType.AUTO)
        val configId: BigDecimal? = null,
        val configCode: String? = null,
        val configValue: String? = null,
        val configNote: String? = null,
        val modifyUserId: BigDecimal? = null,
        val modifyUserName: String? = null,
        val modifyDt: Date? = null,
        val isShow: Short? = null,
        val orgId: Long? = null,
        val configName: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null

) : Serializable
