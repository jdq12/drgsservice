package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.math.BigDecimal

@TableName(schema = "DRGS_DATA")
@KeySequence(value = "DRGS_DATA.SEQ_DATA_INBED_FEE_LIST")
@ApiModel(value = "住院费用明细")
data class TDataInbedFeeList(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "费用明细ID")
        val inbedFeeListid: Long? = null,
        @ApiModelProperty(value = "病案主页ID")
        var inbedMedId: Long? = null,
        @ApiModelProperty(value = "费用类别编码")
        val feeTypeCode: String? = null,
        @ApiModelProperty(value = "费用类别名称")
        val feeTypeName: String? = null,
        @ApiModelProperty(value = "费用明细ID")
        val feeAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用甲类金额")
        val feePubAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用乙类金额")
        val feePartAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用自费金额")
        val feeSelfAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用其它金额")
        val feeOtherAmt: BigDecimal? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null
) : Serializable