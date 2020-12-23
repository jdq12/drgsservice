package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

@KeySequence("DRGS_DATA.SEQ_DATA_STL_MED")
@TableName(schema = "DRGS_DATA")
@ApiModel(value = "门诊病案主页")
data class TDataStlMed(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "门诊病案主页ID")
        val stlMedId: Long? = null,
        @ApiModelProperty(value = "病案号")
        val stlMedCode: String? = null,
        @ApiModelProperty(value = "医院就诊号")
        val hospPsnCode: String? = null,
        @ApiModelProperty(value = "姓名")
        val psnName: String? = null,
        @ApiModelProperty(value = "性别")
        val psnSex: String? = null,
        @ApiModelProperty(value = "出生年月")
        val psnBirth: Date? = null,
        @ApiModelProperty(value = "年龄")
        val psnAge: BigDecimal? = null,
        @ApiModelProperty(value = "新生儿天数")
        val newPsnDays: BigDecimal? = null,
        @ApiModelProperty(value = "患者证件号")
        val idcard: String? = null,
        @ApiModelProperty(value = "特殊人员类型")
        val psnSpeType: String? = null,
        @ApiModelProperty(value = "地区ID")
        val orgId: Long? = null,
        @ApiModelProperty(value = "医院ID")
        val hospId: Long? = null,
        @ApiModelProperty(value = "结算时间")
        val stlDt: Date? = null,
        @ApiModelProperty(value = "医保类型")
        val siType: String? = null,
        @ApiModelProperty(value = "住院号")
        val inbedNo: String? = null,
        @ApiModelProperty(value = "社保卡号")
        val psnCode: String? = null,
        @ApiModelProperty(value = "就诊医生ID")
        val stlDoctId: Long? = null,
        @ApiModelProperty(value = "纠正医生姓名")
        val stlDoctName: String? = null,
        @ApiModelProperty(value = "入院科室ID")
        val stlDepId: BigDecimal? = null,
        @ApiModelProperty(value = "入院科室名称")
        val stlDepName: String? = null,
        @ApiModelProperty(value = "新生儿入院类型")
        val newInbedType: String? = null,

        /**
         * 克
         */
        @ApiModelProperty(value = "新生儿出生体重")
        val newBornWeight: BigDecimal? = null,

        /**
         * 克
         */
        @ApiModelProperty(value = "新生儿入院体重")
        val newInbedWeight: BigDecimal? = null,
        @ApiModelProperty(value = "诊断编码")
        val stlDiagCode: String? = null,
        @ApiModelProperty(value = "诊断名称")
        val stlDiagName: String? = null,
        @ApiModelProperty(value = "诊断方位")
        val stlDiagPos: String? = null,
        @ApiModelProperty(value = "具体病情")
        val stlDiagIlln: String? = null,
        @ApiModelProperty(value = "编码员编号")
        val coderCode: String? = null,
        @ApiModelProperty(value = "编码员名称")
        val coderName: String? = null,
        @ApiModelProperty(value = "费用金额合计")
        val feeSumAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用甲类合计")
        val feePubAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用乙类合计")
        val feePartAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用自费合计")
        val feeSelfAmt: BigDecimal? = null,
        @ApiModelProperty(value = "费用其他合计")
        val feeOtherAmt: BigDecimal? = null,

        /**
         * 1.按项目  2.单病种  3.按病种分值  4.疾病诊断相关分组（DRG）  5.按床日  6.按人头  9.其他
         */
        @ApiModelProperty(value = "医保支付方式")
        val siExpType: String? = null,
        @ApiModelProperty(value = "状态")
        val status: String? = null,
        @ApiModelProperty(value = "修改人ID")
        val modifyUserId: Long? = null,
        @ApiModelProperty(value = "修改人姓名")
        val modifyUser: String? = null,
        @ApiModelProperty(value = "修改时间")
        val modifyDt: Date? = null,
        @ApiModelProperty(value = "是否进入Drgs分组")
        val isDrgsGroup: Long? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null,
        @Transient
        val diags: List<TDataStlDiag>? = null,  //门诊疾病诊断
        @Transient
        val oper: List<TDataStlOper>? = null,   //门诊手术列表
        @Transient
        val feeList: List<TDataStlFeeList>? = null //门诊费用组成明细

) : Serializable
