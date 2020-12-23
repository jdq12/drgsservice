package com.yxsoft.drgsservice.entity.dic

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.KeySequence
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*

@ApiModel(value = "DRGs特殊参数")
@KeySequence(value = "DRGS_BASE.SEQ_DIC_SPE_PARAM")
data class TDicSpeParam(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "特殊参数ID")
        val speParamId: Long? = null,
        @ApiModelProperty(value = "参数编号")
        val paramCode: String? = null,
        @ApiModelProperty(value = "参数名称")
        val paramName: String? = null,
        @ApiModelProperty(value = "备注")
        val note: String? = null,
        @ApiModelProperty(value = "状态")
        val status: String? = "正常",
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
