package com.yxsoft.drgsservice.entity.data

import com.baomidou.mybatisplus.annotation.*
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

@KeySequence(value = "DRGS_DATA.SEQ_DATA_INBED_MED")
@TableName(schema = "DRGS_DATA")
@ApiModel(value = "住院病案首页", description = "住院病案首页")
data class TDataInbedMed(
        @TableId(type = IdType.INPUT)
        @ApiModelProperty(value = "病案主页ID")
        val inbedMedId: Long? = null,
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
        @ApiModelProperty(value = "患者证件号码")
        val idcard: String? = null,
        @ApiModelProperty(value = "特殊人员类型")
        val psnSpeType: String? = null,
        @ApiModelProperty(value = "地区ID")
        val orgId: Long? = null,
        @ApiModelProperty(value = "医院ID")
        val hospId: Long? = null,
        @ApiModelProperty(value = "医保类型")
        val siType: String? = null,
        @ApiModelProperty(value = "住院号")
        val inbedNo: String? = null,
        @ApiModelProperty(value = "社保号")
        val psnCode: String? = null,
        @ApiModelProperty(value = "入院时间")
        val inbedDt: Date? = null,
        @ApiModelProperty(value = "出院时间")
        val outbedDt: Date? = null,
        @ApiModelProperty(value = "实际住院天数")
        val inbedDays: BigDecimal? = null,
        @ApiModelProperty(value = "主管医生ID")
        val doctId: Long? = null,
        @ApiModelProperty(value = "主管医师姓名")
        val doctName: String? = null,
        @ApiModelProperty(value = "是否药物过敏")
        @TableField(value = "IS_DRUG_ALLE")
        val drugAlle: String? = null,
        @ApiModelProperty(value = "过敏药物编码")
        val drugAlleCode: String? = null,
        @ApiModelProperty(value = "过敏药物名称")
        val drugAlleName: String? = null,
        @ApiModelProperty(value = "是否有病理检查")
        @TableField(value = "IS_PATHO_EXAM")
        val pathoExam: String? = null,
        @ApiModelProperty(value = "病理号")
        val pathoNo: String? = null,
        @ApiModelProperty(value = "是否院内感染")
        @TableField(value = "IS_HOSP_INFE")
        val hospInfe: String? = null,
        @ApiModelProperty(value = "院内感染诊断编码")
        val hospInfeCode: String? = null,
        @ApiModelProperty(value = "血型(ABO)")
        val bolldAbo: String? = null,
        @ApiModelProperty(value = "血型(RH)")
        val billdRh: String? = null,
        @ApiModelProperty(value = "主诉")
        val chieComp: String? = null,
        @ApiModelProperty(value = "现病史")
        val mediHist: String? = null,
        @ApiModelProperty(value = "手术史")
        val surgHist: String? = null,
        @ApiModelProperty(value = "输血史")
        val bloodHist: String? = null,
        @ApiModelProperty(value = "婚姻史")
        val marrHist: String? = null,

        /**
         * cm
         */
        @ApiModelProperty(value = "身高")
        val psnHeight: BigDecimal? = null,

        /**
         * 千克
         */
        @ApiModelProperty(value = "体重")
        val psnWeight: BigDecimal? = null,
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

        /**
         * 住院
         * 日间手术
         */
        @ApiModelProperty(value = "医疗类型")
        val mediType: String? = null,
        @ApiModelProperty(value = "特殊病例")
        val speIlln: String? = null,

        /**
         * 1西医
         * 2中医
         * 2.1中医
         * 2.2民族医
         * 3中西医
         */
        @ApiModelProperty(value = "治疗类别")
        val treatCate: String? = null,

        /**
         * 急诊、门诊、其他医疗机构转入、其他
         */
        @ApiModelProperty(value = "入院途径")
        val inbedChan: String? = null,
        @ApiModelProperty(value = "入院诊断编码")
        val inbedDiagCode: String? = null,
        @ApiModelProperty(value = "入院诊断名称")
        val inbedDiagName: String? = null,
        @ApiModelProperty(value = "入院诊断方位")
        val inbedDiagPos: String? = null,
        @ApiModelProperty(value = "入院具体病情")
        val inbedDiagIlln: String? = null,
        @ApiModelProperty(value = "出院床位号")
        val oubedBedNo: String? = null,
        @ApiModelProperty(value = "出院诊断编码")
        val outbedDiagCode: String? = null,
        @ApiModelProperty(value = "出院诊断名称")
        val outbedDiagName: String? = null,
        @ApiModelProperty(value = "出院诊断方位")
        val outbedDiagIlln: String? = null,
        @ApiModelProperty(value = "入院科室ID")
        val inbedDepId: BigDecimal? = null,
        @ApiModelProperty(value = "入院科室名称")
        val inbedDepName: String? = null,
        @ApiModelProperty(value = "转院科室ID")
        val tranDepId: Long? = null,
        @ApiModelProperty(value = "转院科室名称")
        val tranDepName: String? = null,
        @ApiModelProperty(value = "出院科室ID")
        val outbedDepId: BigDecimal? = null,
        @ApiModelProperty(value = "出院科室名称")
        val outbedDepName: String? = null,
        @ApiModelProperty(value = "编码员编号")
        val coderCode: String? = null,
        @ApiModelProperty(value = "编码员名称")
        val coderName: String? = null,
        @ApiModelProperty(value = "入院前颅脑损伤患者昏迷时间(天)")
        val befoAdmiComaDay: BigDecimal? = null,
        @ApiModelProperty(value = "入院前颅脑损伤患者昏迷时间(小时)")
        val befoAdmiComaHour: BigDecimal? = null,
        @ApiModelProperty(value = "入院前颅脑损伤患者昏迷时间(分钟)")
        val befoAdmiComaMinu: BigDecimal? = null,
        @ApiModelProperty(value = "入院后颅脑损伤患者昏迷时间(天)")
        val afterAdmiComaDay: BigDecimal? = null,
        @ApiModelProperty(value = "入院后颅脑损伤患者昏迷时间(小时)")
        val afterAdmiComaHour: BigDecimal? = null,
        @ApiModelProperty(value = "入院后颅脑损伤患者昏迷时间(分钟)")
        val afterAdmiComaMinu: BigDecimal? = null,
        @ApiModelProperty(value = "呼吸机使用时间(天)")
        val respUseDay: BigDecimal? = null,
        @ApiModelProperty(value = "呼吸机使用时间(小时)")
        val respUseHour: BigDecimal? = null,
        @ApiModelProperty(value = "呼吸机使用时间(分钟)")
        val respUseMinu: BigDecimal? = null,
        @ApiModelProperty(value = "三级护理(天)")
        val terCardDay: BigDecimal? = null,
        @ApiModelProperty(value = "二级护理(天)")
        val secCardDay: BigDecimal? = null,
        @ApiModelProperty(value = "一级护理(天)")
        val priCardDay: BigDecimal? = null,
        @ApiModelProperty(value = "特级护理")
        val speCardDay: BigDecimal? = null,
        @ApiModelProperty(value = "输血品种")
        val bloodVari: String? = null,
        @ApiModelProperty(value = "输血量")
        val bloodVol: BigDecimal? = null,
        @ApiModelProperty(value = "输血计量单位")
        val bloodUnit: String? = null,

        /**
         * 1医嘱离院 2医嘱转院、转社区 3非医嘱离院 4死亡  9其他
         */
        @ApiModelProperty(value = "离院方式")
        val leavHospMode: String? = null,
        @ApiModelProperty(value = "接受机构编码")
        val recOrgCode: String? = null,
        @ApiModelProperty(value = "接受机构名称")
        val recOrgName: String? = null,

        /**
         * 1.是，0.否
         */
        @ApiModelProperty(value = "出院31日再入院")
        @TableField(value = "IS_REP_INBED")
        val repInbed: String? = null,
        @ApiModelProperty(value = "再入院目的")
        val repInbedNote: String? = null,
        @ApiModelProperty(value = "结算时间")
        val stlDt: Date? = null,
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
        @ApiModelProperty(value = "操作员ID")
        val modifyUserId: Long? = null,
        @ApiModelProperty(value = "操作员")
        val modifyUser: String? = null,
        @ApiModelProperty(value = "操作时间")
        val modifyDt: Date? = null,

        /**
         * 0 未分组  1已分组
         */
        @ApiModelProperty(value = "是否已分组")
        @TableField(value = "IS_DRGS_GROUP")
        val drgsGroup: Long? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null,


        @Transient
        val diags: List<TDataInbedDiag>? = null,      //诊断列表

        @Transient
        val feeList: List<TDataInbedFeeList>? = null, //费用明细列表

        @Transient
        val checkList: List<TDataInbedCheckList>? = null, //检查主单列表

        @Transient
        val oper: List<TDataInbedOper>? = null, //手术列表

//        @Transient
//        val operList: List<TDataInbedOperList>? = null, //手术明细列表

        @Transient
        val icuList: List<TDataInbedIcuList>? = null, // 重症监护列表

        @Transient
        val outbedSumm: List<TDataInbedOutbedSumm>? = null, // 出院小结列表


) : Serializable {}
