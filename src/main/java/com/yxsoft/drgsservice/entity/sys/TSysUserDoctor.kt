package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.KeySequence
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import com.yxsoft.drgsservice.entity.reg.TRegDoctor
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.math.BigDecimal
import javax.swing.text.html.HTML.Tag.INPUT

//jdq 新增医生用户关联表实体模型注解
@ApiModel(value = "用户医生关联表")
data class TSysUserDoctor(
        @TableId(type = IdType.INPUT)
        val userId: BigDecimal? = null,
        @ApiModelProperty(value = "医生Id")
        val doctorId: BigDecimal? = null,

        @Transient
        val doctor: List<TRegDoctor>? = null, // 医生列表

        @Transient
        val user: List<TSysUser>? = null, // 操作员列表
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null
) : Serializable
