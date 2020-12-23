package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable

@TableName(schema = "DRGS_DATA")
@KeySequence(value = "DRGS_DATA.SEQ_DATA_INBED_DIAG")
@ApiModel(value = "住院疾病诊断")
data class TDataInbedDiag(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "疾病诊断ID")
        val inbedDiagId: Long? = null,
        @ApiModelProperty(value = "主页病案ID")
        var inbedMedId: Long? = null,

        /**
         * 主诊断 其他诊断
         */
        @ApiModelProperty(value = "疾病诊断类别")
        val diagType: String? = null,

        /**
         * 西医诊断  中医诊断
         */
        @ApiModelProperty(value = "疾病诊断方式")
        val diagWay: String? = null,
        @ApiModelProperty(value = "诊断编号")
        val diagCode: String? = null,
        @ApiModelProperty(value = "诊断名称")
        val diagName: String? = null,

        /**
         * 有（填具体病情） 临床未确定  情况不明   无
         */
        @ApiModelProperty(value = "入院病情")
        val inbedDiagType: String? = null,
        @ApiModelProperty(value = "入院病情说明")
        val inbedDiagNote: String? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null,
        @ApiModelProperty(value = "医保编号")
        var hiDiagCode:String? = null,
        @ApiModelProperty(value = "医保名称")
        var hiDiagName:String? = null


) : Serializable
