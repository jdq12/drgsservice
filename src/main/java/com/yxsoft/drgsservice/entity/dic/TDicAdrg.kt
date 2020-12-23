package com.yxsoft.drgsservice.entity.dic

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*

// MODEl类描述
@ApiModel(value = "核心疾病诊断分组ADRG")
data class TDicAdrg(
        // 字段描述
        @ApiModelProperty(value = "核心诊断分组ID")
        @TableId("adrg_id", type = IdType.AUTO)
        val adrgId: Long? = null,
        @ApiModelProperty(value = "主诊断ID")
        val mdcId: Long? = null,
        @ApiModelProperty(value = "核心分组编号")
        val paramCode: String? = null,
        @ApiModelProperty(value = "核心分组名称")
        val paramName: String? = null,
        @ApiModelProperty(value = "分组类别")
        val adrgType: String? = null,
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
        @ApiModelProperty(value = "参数简码")
        val paramAbbr: String? = null,
        @ApiModelProperty(value = "参数顺序码")
        val paramOrder: String? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null

) : Serializable
