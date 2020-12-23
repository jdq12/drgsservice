package com.yxsoft.drgsservice.entity.dic

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*

@ApiModel(value = "疾病诊断分组DRG")
data class TDicDrg(
        @TableId(type = IdType.AUTO)
        @ApiModelProperty(value = "诊断分组ID")
        val drgId: Long? = null,
        @ApiModelProperty(value = "核心诊断分组ID")
        val adrgId: Long? = null,
        @ApiModelProperty(value = "分组编号")
        val paramCode: String? = null,
        @ApiModelProperty(value = "分组名称")
        val paramName: String? = null,
        @ApiModelProperty(value = "参数简码")
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
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null

) : Serializable
