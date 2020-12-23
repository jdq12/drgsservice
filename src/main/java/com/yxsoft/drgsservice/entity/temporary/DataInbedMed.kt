package com.yxsoft.drgsservice.entity.temporary

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*


@TableName(value = "DRGS_CHECK.T_DATA_INBED_MED")
data class DataInbedMed(
        @TableId(value = "INBED_MED_ID", type = IdType.INPUT)
        var inbedMedId: Long? = null,
        var stlMedCode: String? = null,
        var hospPsnCode: String? = null,
        var psnName: String? = null,
        var psnSex: String? = null,
        var psnBirth: Date? = null,
        var psnAge: BigDecimal? = null,
        var newPsnDays: BigDecimal? = null,
        var idcard: String? = null,
        var psnSpeType: String? = null,
        var orgId: Long? = null,
        var hospId: Long? = null,
        var siType: String? = null,
        var inbedNo: String? = null,
        var psnCode: String? = null,
        var inbedDt: Date? = null,
        var outbedDt: Date? = null,
        var inbedDays: BigDecimal? = null,
        var doctId: Long? = null,
        var doctName: String? = null,
        @TableField(value = "IS_DRUG_ALLE")
        val drugAlle: String? = null,
        var drugAlleCode: String? = null,
        var drugAlleName: String? = null,
        @TableField(value = "IS_PATHO_EXAM")
        val pathoExam: String? = null,
        var pathoNo: String? = null,
        @TableField(value = "IS_HOSP_INFE")
        val hospInfe: String? = null,
        var hospInfeCode: String? = null,
        var bolldAbo: String? = null,
        var billdRh: String? = null,
        var chieComp: String? = null,
        var mediHist: String? = null,
        var surgHist: String? = null,
        var bloodHist: String? = null,
        var marrHist: String? = null,
        var psnHeight: BigDecimal? = null,
        var psnWeight: BigDecimal? = null,
        var newInbedType: String? = null,
        var newBornWeight: BigDecimal? = null,
        var newInbedWeight: BigDecimal? = null,
        var mediType: String? = null,
        var speIlln: String? = null,
        var treatCate: String? = null,
        var inbedChan: String? = null,
        var inbedDiagCode: String? = null,
        var inbedDiagName: String? = null,
        var inbedDiagPos: String? = null,
        var inbedDiagIlln: String? = null,
        var oubedBedNo: String? = null,
        var outbedDiagCode: String? = null,
        var outbedDiagName: String? = null,
        var outbedDiagIlln: String? = null,
        var inbedDepId: Long? = null,
        var inbedDepName: String? = null,
        var tranDepId: Long? = null,
        var tranDepName: String? = null,
        var outbedDepId: Long? = null,
        var outbedDepName: String? = null,
        var coderCode: String? = null,
        var coderName: String? = null,
        var befoAdmiComaDay: BigDecimal? = null,
        var befoAdmiComaHour: BigDecimal? = null,
        var befoAdmiComaMinu: BigDecimal? = null,
        var afterAdmiComaDay: BigDecimal? = null,
        var afterAdmiComaHour: BigDecimal? = null,
        var afterAdmiComaMinu: BigDecimal? = null,
        var respUseDay: BigDecimal? = null,
        var respUseHour: BigDecimal? = null,
        var respUseMinu: BigDecimal? = null,
        var terCardDay: BigDecimal? = null,
        var secCardDay: BigDecimal? = null,
        var priCardDay: BigDecimal? = null,
        var speCardDay: BigDecimal? = null,
        var bloodVari: String? = null,
        var bloodVol: BigDecimal? = null,
        var bloodUnit: String? = null,
        var leavHospMode: String? = null,
        var recOrgCode: String? = null,
        var recOrgName: String? = null,
        @TableField(value = "IS_REP_INBED")
        val repInbed: String? = null,
        var repInbedNote: String? = null,
        var stlDt: Date? = null,
        var feeSumAmt: BigDecimal? = null,
        var feePubAmt: BigDecimal? = null,
        var feePartAmt: BigDecimal? = null,
        var feeSelfAmt: BigDecimal? = null,
        var feeOtherAmt: BigDecimal? = null,
        var siExpType: String? = null,
        var status: String? = null,
        var modifyUserId: Long? = null,
        var modifyUser: String? = null,
        var modifyDt: Date? = null,
        @TableField(value = "IS_DRGS_GROUP")
        val drgsGroup: Long? = null,
        var deleted: BigDecimal? = null,

        @Transient
        val diags:List<DataInbedDiag>? = null, // 临时诊断表

        @Transient
        val operList:List<DataInbedOperList>? = null, //临时手术明细列表

) : Serializable {}
