package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable

@KeySequence(value = "DRGS_DATA.SEQ_DATA_STL_DIAG")
@TableName(schema = "DRGS_DATA")
@ApiModel(value = "门诊病案诊断")
data class TDataStlDiag(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "门诊诊断ID")
        val stlDiagId: Long? = null,
        @ApiModelProperty(value = "病案主页ID")
        var stlMedId: Long? = null,

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
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null

) : Serializable
