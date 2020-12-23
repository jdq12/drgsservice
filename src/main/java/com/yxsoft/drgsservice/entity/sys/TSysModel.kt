package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.math.BigDecimal

data class TSysModel(
        @TableId(type = IdType.AUTO)
        val modelId: BigDecimal? = null,
        val modelCode: String? = null,
        val modelName: String? = null,
        val modelGroup: String? = null,
        val modelNo: String? = null,
        val modelGroupId: BigDecimal? = null,
        val status: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null

) : Serializable
