package com.yxsoft.drgsservice.entity.dic

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*

@ApiModel(value = "主要诊断大类MDC", description = "主要诊断大类MDC")
data class TDicMdc(
        @TableId(type = IdType.AUTO)
        @ApiModelProperty(value = "主要诊断ID")
        val mdcId: Long? = null,
        @ApiModelProperty(value = "诊断编码")
        val paramCode: String? = null,
        @ApiModelProperty(value = "诊断名称")
        val paramName: String? = null,
        @ApiModelProperty(value = "参数缩写")
        val paramAbbr: String? = null,
        @ApiModelProperty(value = "备注")
        val note: String? = null,
        @ApiModelProperty(value = "状态")
        val status: String? = null,
        @ApiModelProperty(value = "修改人ID")
        val modifyUserId: Long? = null,
        @ApiModelProperty(value = "修改人")
        val modifyUserName: String? = null,
        @ApiModelProperty(value = "修改时间")
        val modifyDt: Date? = null,
        @ApiModelProperty(value = "优先等级")
        val prioLevel: Long? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null

) : Serializable
