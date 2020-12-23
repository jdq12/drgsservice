package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable

@TableName(schema = "DRGS_DATA")
@KeySequence(value = "DRGS_DATA.SEQ_DATA_INBED_OPER_LIST")
@ApiModel(value = "住院手术明细列表")
data class TDataInbedOperList(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "住院明细列表ID")
        val inbedOperListId: Long? = null,
        @ApiModelProperty(value = "手术列表ID")
        var inbedOperId: Long? = null,
        @ApiModelProperty(value = "手术明细序号")
        val operNo: String? = null,
        @ApiModelProperty(value = "手术代码")
        val operCode: String? = null,
        @ApiModelProperty(value = "手术名称")
        val operName: String? = null,
        @ApiModelProperty(value = "手术等级")
        val operLevel: String? = null,
        @ApiModelProperty(value = "手术切口分类")
        val operInciType: String? = null,
        @ApiModelProperty(value = "手术切口愈合等级")
        val operHealLevel: String? = null,

        /**
         * 0-非主手术；1-主手术
         * 一次手术记录，有且只有一个主手术
         *
         */
        @ApiModelProperty(value = "主次标志")
        val operMainIden: String? = null,

        /**
         * 0：否；1：是
         */
        @ApiModelProperty(value = "是否医源性手术")
        @TableField(value = "IS_TATR")
        val tatr: String? = null,
        @ApiModelProperty(value = "住院病案主页ID")
        var inbedMedId: Long? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null,
        @ApiModelProperty(value = "医保手术编码")
        var hiOperCode:String? = null,
        @ApiModelProperty(value = "医保手术名称")
        var hiOperName:String? = null

) : Serializable
