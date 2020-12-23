package com.yxsoft.drgsservice.entity.check

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.KeySequence
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.math.BigDecimal
import java.util.*
@ApiModel(value = "DRGS分组管理统计")
@TableName(schema = "DRGS_DATA")
@KeySequence(value = "DRGS_DATA.SEQ_CHECK_INBED_DRGS")
data class TCheckInbedDrgs(
        @TableId(value = "INBED_DGRS_ID",type = IdType.AUTO)
        @ApiModelProperty(value = "住院分组明细ID")
        val inbedDgrsId: Long? = null,
        @ApiModelProperty(value = "病案主页Id")
        val inbedMedId: Long? = null,
        @ApiModelProperty("地区Id")
        val orgId: Long? = null,
        @ApiModelProperty("医院Id")
        val hospId: Long? = null,
        @ApiModelProperty("出院科室Id")
        val depId: Long? = null,
        @ApiModelProperty("主管医生Id")
        val doctId: Long? = null,
        @ApiModelProperty("病案号")
        val stlMedCode: String? = null,
        @ApiModelProperty("医院就诊号")
        val hospPsnCode: String? = null,
        @ApiModelProperty("姓名")
        val psnName: String? = null,
        @ApiModelProperty("出生年月")
        val psnBirth: Date? = null,
        @ApiModelProperty("社保号")
        val psnCode: String? = null,
        @ApiModelProperty("出院时间")
        val outbedDt: Date? = null,
        @ApiModelProperty("分组状态")
        val groupStatus: String? = null,
        @ApiModelProperty("分组编码_1")
        val groupCode_1: String? = null,
        @ApiModelProperty("分组编码_2")
        val groupCode_2: String? = null,
        @ApiModelProperty("分组编码_3")
        val groupCode_3: String? = null,
        @ApiModelProperty("分组编码_4")
        val groupCode_4: String? = null,
        @ApiModelProperty("分组编码")
        val groupCode: String? = null,
        @ApiModelProperty("分组名称")
        val groupName: String? = null,
        @ApiModelProperty("诊断编码")
        val diagCode: String? = null,
        @ApiModelProperty("诊断名称")
        val diagName: String? = null,
        @ApiModelProperty("手术编码")
        val operCode: String? = null,
        @ApiModelProperty("手术名称")
        val operName: String? = null,
        @ApiModelProperty("状态")
        val status: String? = null,
        @ApiModelProperty("操作员Id")
        val modifyUserId: Long? = null,
        @ApiModelProperty("操作员")
        val modifyUser: String? = null,
        @ApiModelProperty("操作时间")
        val modifyDt: Date? = null,
        @ApiModelProperty("分组备注")
        val groupNote: String? = null,
        @ApiModelProperty("主诊断Id")
        val mdcId: Long? = null,
        @ApiModelProperty("adrgId")
        val adrgId: Long? = null,
        @ApiModelProperty("是否删除")
        val deleted: BigDecimal? = null,
        @ApiModelProperty("费用小计")
        val feeSumAmt: BigDecimal? = null,
        @ApiModelProperty("住院天数")
        val inbedDays: BigDecimal? = null
) : Serializable
