package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable

@TableName(schema = "DRGS_DATA")
@KeySequence(value = "DRGS_DATA.SEQ_DATA_INBED_OUTBED_SUMM")
@ApiModel(value = "出院小结")
data class TDataInbedOutbedSumm(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "出院小结ID")
        val outbedSummId: Long? = null,
        @ApiModelProperty(value = "病案首页ID")
        var inbedMedId: Long? = null,

        /**
         * 1-治愈 2-好转 3-未治愈 4-死亡 5-其它
         */
        @ApiModelProperty(value = "出院转归")
        val outbedType: String? = null,
        @ApiModelProperty(value = "入院情况")
        val inbedNote: String? = null,
        @ApiModelProperty(value = "诊疗过程")
        val treatProc: String? = null,
        @ApiModelProperty(value = "出院情况")
        val outbedNote: String? = null,
        @ApiModelProperty(value = "出院医嘱")
        val outbedAdvice: String? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null

) : Serializable
