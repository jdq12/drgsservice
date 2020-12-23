package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import com.yxsoft.drgsservice.entity.reg.TRegDep
import com.yxsoft.drgsservice.entity.reg.TRegDoctor
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.math.BigDecimal

@ApiModel(value = "科室医生关联表")
data class TSysDepDoctor(
        @TableId(type = IdType.INPUT)
        var doctorId: Long? = null,
        @ApiModelProperty(value = "科室Id")
        var depId: Long? = null,
        @JsonIgnore
        @TableLogic
        val deleted: BigDecimal? = null,
        @Transient
        val doctor: List<TRegDoctor>? = null, // 医生列表
        @Transient
        val dep: List<TRegDep>? = null, // 操作员列表
) : Serializable
