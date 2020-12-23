package com.yxsoft.drgsservice.entity.reg

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

data class TRegSiType(
        @TableId(value = "SI_TYPE_ID", type = IdType.AUTO)
        val siTypeId: BigDecimal? = null,
        val orgId: BigDecimal? = null,
        val modifyUserId: BigDecimal? = null,
        val modifyUserName: String? = null,
        val modifyDt: Date? = null,
        val status: String? = null,
        val note: String? = null,
        val siTypeCode: String? = null,
        val siTypeName: String? = null,
        val hospOwnerId: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null

) : Serializable
