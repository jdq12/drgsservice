package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*

@TableName(schema = "DRGS_DATA")
@KeySequence(value = "DRGS_DATA.SEQ_DATA_INBED_OPER")
@ApiModel(value = "住院手术列表")
data class TDataInbedOper(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "手术列表ID")
        val inbedOperId: Long? = null,
        @ApiModelProperty(value = "病案主页ID")
        var inbedMedId: Long? = null,
        @ApiModelProperty(value = "手术记录顺序")
        val inbedOperNo: String? = null,
        @ApiModelProperty(value = "手术医师编号")
        val operDoctCode: String? = null,
        @ApiModelProperty(value = "手术医师姓名")
        val operDoctName: String? = null,
        @ApiModelProperty(value = "手术1助编号")
        val operOneAssiCode: String? = null,
        @ApiModelProperty(value = "手术1助姓名")
        val operOneAssiName: String? = null,
        @ApiModelProperty(value = "手术2助编号")
        val operTwoAssiCode: String? = null,
        @ApiModelProperty(value = "手术2助姓名")
        val operTwoAssiName: String? = null,
        @ApiModelProperty(value = "麻醉师编号")
        val operAnesCode: String? = null,
        @ApiModelProperty(value = "麻醉师名称")
        val operAnesName: String? = null,
        @ApiModelProperty(value = "手术执行时间")
        val operStaDt: Date? = null,
        @ApiModelProperty(value = "手术完成时间")
        val operEndDt: Date? = null,
        @ApiModelProperty(value = "麻醉方式")
        val operAnesType: String? = null,
        @ApiModelProperty(value = "是否手术并发症")
        @TableField(value = "IS_OPER_COMP")
        val operComp: String? = null,
        @ApiModelProperty(value = "手术并发症编号")
        val operCompCode: String? = null,
        @ApiModelProperty(value = "手术并发症名称")
        val operCompName: String? = null,
        @ApiModelProperty(value = "手术记录")
        val operRecoNote: String? = null,
        @ApiModelProperty(value = "手术记录医师编号")
        val operRecoDoctCode: String? = null,
        @ApiModelProperty(value = "手术记录医师姓名")
        val operRecoDoctName: String? = null,
        @ApiModelProperty(value = "手术类别")
        val operType: String? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null,

        @Transient
        val operList: List<TDataInbedOperList>? = null, //手术明细列表

) : Serializable