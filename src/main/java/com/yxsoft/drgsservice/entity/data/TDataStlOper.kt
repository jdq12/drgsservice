package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*

@KeySequence(value = "DRGS_DATA.SEQ_DATA_STL_OPER")
@TableName(schema = "DRGS_DATA")
@ApiModel(value = "门诊手术列表")
data class TDataStlOper(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "手术操作列表ID")
        val stlOperId: Long? = null,
        @ApiModelProperty(value = "门诊病案主页ID")
        var stlMedId: Long? = null,
        @ApiModelProperty(value = "手术操作记录顺序")
        val stlOperNo: String? = null,
        @ApiModelProperty(value = "手术操作医师编号")
        val operDoctCode: String? = null,
        @ApiModelProperty(value = "手术操作医师姓名")
        val operDoctName: String? = null,
        @ApiModelProperty(value = "手术操作执行时间")
        val operStaDt: Date? = null,
        @ApiModelProperty(value = "手术操作完成时间")
        val operEndDt: Date? = null,
        @ApiModelProperty(value = "手术操作代码")
        val operCode: String? = null,
        @ApiModelProperty(value = "手术操作名称")
        val operName: String? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null


) : Serializable
