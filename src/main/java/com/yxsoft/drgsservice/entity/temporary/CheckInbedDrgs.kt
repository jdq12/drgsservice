package com.yxsoft.drgsservice.entity.temporary

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*


@TableName(value = "DRGS_CHECK.T_CHECK_INBED_DRGS")
data class CheckInbedDrgs(
        @TableId(value = "INBED_DGRS_ID", type = IdType.INPUT)
        var inbedDgrsId: Long? = null,
        var inbedMedId: Long? = null,
        var orgId: Long? = null,
        var hospId: Long? = null,
        var depId: Long? = null,
        var doctId: Long? = null,
        var stlMedCode: String? = null,
        var hospPsnCode: String? = null,
        var psnName: String? = null,
        var psnBirth: Date? = null,
        var psnCode: String? = null,
        var outbedDt: Date? = null,
        var groupStatus: String? = null,
        var groupCode1: String? = null,
        var groupCode2: String? = null,
        var groupCode3: String? = null,
        var groupCode4: String? = null,
        var groupCode: String? = null,
        var groupName: String? = null,
        var diagCode: String? = null,
        var diagName: String? = null,
        var operCode: String? = null,
        var operName: String? = null,
        var status: String? = null,
        var modifyUserId: Long? = null,
        var modifyUser: String? = null,
        var modifyDt: Date? = null,
        var groupNote: String? = null,
        var mdcId: Long? = null,
        var adrgId: Long? = null,
        var deleted: BigDecimal? = null,
        var feeSumAmt: BigDecimal? = null,
        var inbedDays: BigDecimal? = null

) : Serializable
