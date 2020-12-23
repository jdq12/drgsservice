package com.yxsoft.drgsservice.entity.dic

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*

@ApiModel(value = "严重并发或合并症MCC")
data class TDicMcc(
        @TableId(type = IdType.AUTO)
        @ApiModelProperty(value = "严重并发或合并症ID")
        val mccId: Long? = null,
        @ApiModelProperty(value = "排除分组ID")
        val removeGroupId: Long? = null,
        @ApiModelProperty(value = "严重并发或合并症编号")
        val paramCode: String? = null,
        @ApiModelProperty(value = "严重并发或合并症名称")
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
        @ApiModelProperty(value = "优先等级(猜测)")
        val prioLevel: Long? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null

) : Serializable
