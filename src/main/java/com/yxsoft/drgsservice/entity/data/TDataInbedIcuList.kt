package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.util.*

@TableName(schema = "DRGS_DATA")
@KeySequence(value = "DRGS_DATA.SEQ_DATA_INBED_ICU_LIST")
@ApiModel(value = "住院重症监护", description = "住院重症监护")
data class TDataInbedIcuList(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "重症监护ID")
        val inbedIcuListId: Long? = null,
        @ApiModelProperty(value = "病案主页ID")
        var inbedMedId: Long? = null,

        /**
         * CCU、NICU、EICU、SICU、PICU、RICU、其他等
         *
         */
        @ApiModelProperty(value = "重症监护室类型")
        val inbedIcuType: String? = null,
        @ApiModelProperty(value = "进重症监护时间")
        val inbedIcuInDt: Date? = null,
        @ApiModelProperty(value = "出重症监护时间")
        val inbedIcuOutDt: Date? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null


) : Serializable {}
