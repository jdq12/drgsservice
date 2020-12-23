package com.yxsoft.drgsservice.entity.reg

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

data class TRegHosp(
        @TableId(value = "HOSP_ID", type = IdType.AUTO)
        val hospId: BigDecimal? = null,
        val orgId: BigDecimal? = null,
        val hospLevelId: BigDecimal? = null,
        val modifyUserId: BigDecimal? = null,
        val modifyUserName: String? = null,
        val modifyDt: Date? = null,
        val status: String? = null,
        val note: String? = null,
        val hospCode: String? = null,
        val hospName: String? = null,
        val hospTypeCode: String? = null,
        val hospTypeName: String? = null,
        val address: String? = null,
        val contactPsn: String? = null,
        val telephone: String? = null,
        val hospOwnerId: String? = null,
        val levelTypeCode: String? = null,
        val levelTypeName: String? = null,
        val apprBedCnt: BigDecimal? = null,
        val orgName: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null

) : Serializable
