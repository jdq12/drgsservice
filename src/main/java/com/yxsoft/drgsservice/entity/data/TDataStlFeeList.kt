package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.math.BigDecimal

@KeySequence(value = "DRGS_DATA.SEQ_DATA_STL_FEE_LIST")
@TableName(schema = "DRGS_DATA")
@ApiModel(value = "门诊费用组成明细")
data class TDataStlFeeList(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "费用明细ID")
        val stlFeeListid: Long? = null,
        @ApiModelProperty(value = "门诊病案主页ID")
        var stlMedId: Long? = null,
        @ApiModelProperty(value = "费用类别编号")
        val feeTypeCode: String? = null,
        @ApiModelProperty(value = "费用类别名称")
        val feeTypeName: String? = null,
        @ApiModelProperty(value = "费用合计金额")
        val feeAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用甲类金额")
        val feePubAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用乙类金额")
        val feePartAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用自费金额")
        val feeSelfAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用其他金额")
        val feeOtherAmt: BigDecimal? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null

) : Serializable
