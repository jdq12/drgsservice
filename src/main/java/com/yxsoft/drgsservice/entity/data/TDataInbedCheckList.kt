package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*

@TableName(schema = "DRGS_DATA")
@KeySequence(value = "DRGS_DATA.SEQ_DATA_INBED_CHECK_LIST")
@ApiModel(value="住院检查主单")
data class TDataInbedCheckList(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "检查单ID")
        val checkListId: Long? = null,
        @ApiModelProperty(value = "住院病案首页ID")
        var inbedMedId: Long? = null,
        @ApiModelProperty(value = "检查单编号")
        val checkListCode: String? = null,
        @ApiModelProperty(value = "申请科室代码")
        val checkDepCode: String? = null,
        @ApiModelProperty(value = "申请科室名称")
        val checkDepName: String? = null,
        @ApiModelProperty(value = "检查项目编码")
        val checkItemCode: String? = null,
        @ApiModelProperty(value = "检查项名称")
        val checkItmeName: String? = null,
        @ApiModelProperty(value = "申请医师编号")
        val checkDoctCode: String? = null,
        @ApiModelProperty(value = "申请医师名称")
        val checkDoctName: String? = null,
        @ApiModelProperty(value = "申请日期")
        val checkDt: Date? = null,
        @ApiModelProperty(value = "报告日期")
        val reportDt: Date? = null,
        @ApiModelProperty(value = "检查部位名称")
        val checkPosiName: String? = null,
        @ApiModelProperty(value = "报告结果")
        val checkReportNo: String? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null
) : Serializable
