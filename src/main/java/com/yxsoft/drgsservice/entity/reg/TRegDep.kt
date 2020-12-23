package com.yxsoft.drgsservice.entity.reg

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import com.yxsoft.drgsservice.controller.sys.BaseModifyInfo
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

@ApiModel(value = "科室表")
@KeySequence(value = "DRGS_BASE.SEQ_REG_DEP")
data class TRegDep(
        @TableId(value = "DEP_ID", type = IdType.INPUT)
        @ApiModelProperty(value = "科室ID")
        val depId: BigDecimal? = null,
//        @ApiModelProperty(value = "修改人ID")
//        val modifyUserId: BigDecimal? = null,
//        @ApiModelProperty(value = "修改人")
//        val modifyUserName: String? = null,
//        @ApiModelProperty(value = "修改时间")
//        val modifyDt: Date? = null,
        @ApiModelProperty(value = "状态")
        val status: String? = "正常",
        @ApiModelProperty(value = "备注")
        val note: String? = null,
        @ApiModelProperty(value = "医院内部ID")
        val hospOwnerId: String? = null,
        @ApiModelProperty(value = "科室编号")
        val depCode: String? = null,
        @ApiModelProperty(value = "科室名称")
        val depName: String? = null,
        @ApiModelProperty(value = "是否为重点科室")
        @TableField(value = "IS_SPECIAL")
        val special: Long? = null,
        @ApiModelProperty(value = "重点科室等级")
        val specialLev: String? = null,
        @ApiModelProperty(value = "医院ID")
        val hospId: BigDecimal? = null,
        @ApiModelProperty(value = "拼写编码")
        val spellCode: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null
) : Serializable, BaseModifyInfo()
