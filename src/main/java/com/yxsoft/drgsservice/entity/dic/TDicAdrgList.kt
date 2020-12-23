package com.yxsoft.drgsservice.entity.dic

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*

@ApiModel(value = "核心疾病诊断分组列表ADRG")
data class TDicAdrgList(
        @TableId(type = IdType.AUTO)
        @ApiModelProperty(value = "诊断分组列表ID")
        val adrgListId: Long? = null,
        @ApiModelProperty(value = "主诊断ID")
        val mdcId: Long? = null,
        @ApiModelProperty(value = "核心诊断分组ID")
        val adrgId: Long? = null,
        @ApiModelProperty(value = "核心诊断名称")
        val adrgName: String? = null,
        @ApiModelProperty(value = "核心诊断分组列表编号")
        val paramCode: String? = null,
        @ApiModelProperty(value = "核心诊断分组列表名称")
        val paramName: String? = null,
        @ApiModelProperty(value = "核心诊断列表类型")
        val adrgListType: String? = null,
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
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null

) : Serializable
