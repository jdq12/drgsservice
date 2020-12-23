package com.yxsoft.drgsservice.entity.reg

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import com.yxsoft.drgsservice.controller.sys.BaseModifyInfo
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.math.BigDecimal

@ApiModel(value = "医生人员表")
@KeySequence(value = "DRGS_BASE.SEQ_REG_DOCTOR")
data class TRegDoctor(
        @TableId(value = "DOCTOR_ID", type = IdType.INPUT)
        @ApiModelProperty(value = "医生ID(表主键)")
        val doctorId: BigDecimal? = null,
        @ApiModelProperty(value = "科室ID")
        val depId: BigDecimal? = null,
        @ApiModelProperty(value = "地区ID")
        val orgId: Int = 1,
        @ApiModelProperty(value = "医院ID")
        val hospId: BigDecimal? = null,
//        @ApiModelProperty(value = "修改人ID")
//        var modifyUserId: BigDecimal? = null,
//        @ApiModelProperty(value = "修改人")
//        var modifyUserName: String? = null,
//        @ApiModelProperty(value = "修改时间")
//        var modifyDt: Date? = null,
        @ApiModelProperty(value = "状态")
        val status: String? = "正常",
        @ApiModelProperty(value = "备注")
        val note: String? = null,
        @ApiModelProperty(value = "医院内部ID")
        val hospOwnerId: String? = null,
        @ApiModelProperty(value = "医生编码")
        val doctorCode: String? = null,
        @ApiModelProperty(value = "医生名字")
        val doctorName: String? = null,
        @ApiModelProperty(value = "性别编码")
        val genderCode: String? = null,
        @ApiModelProperty(value = "性别名称")
        val genderName: String? = null,
        @ApiModelProperty(value = "职业编码")
        val professionCode: String? = null,
        @ApiModelProperty(value = "职业名称")
        val professionName: String? = null,
        @ApiModelProperty(value = "职务名称")
        val jobTitleName: String? = null,
        @ApiModelProperty(value = "医生ID")
        val doctorNo: String? = null,
        @ApiModelProperty(value = "是否为专家")
        @TableField(value = "IS_EXPERT")
        val expert: Long? = null,
        @ApiModelProperty(value = "职务代码")
        val jobTitleCode: String? = null,
        @ApiModelProperty(value = "拼写代码")
        val spellCode: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null

//wanghao:继承entity全局父类
) : Serializable, BaseModifyInfo()
