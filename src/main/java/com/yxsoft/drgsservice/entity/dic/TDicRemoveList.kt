package com.yxsoft.drgsservice.entity.dic

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*


@ApiModel(value = "并发症排除诊断分别分组列表")
data class TDicRemoveList(
        @TableId(type = IdType.AUTO)
        @ApiModelProperty(value = "排除诊断ID")
        val removeListId: Long? = null,
        @ApiModelProperty(value = "排除分组ID")
        val removeGroupId: Long? = null,
        @ApiModelProperty(value = "排除诊断编号")
        val paramCode: String? = null,
        @ApiModelProperty(value = "排除诊断名称")
        val paramName: String? = null,
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
