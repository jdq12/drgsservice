package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.math.BigDecimal
import java.util.*

data class TSysOrg(
        @TableId(type = IdType.AUTO)
        val orgId: BigDecimal? = null,
        val modifyUserId: BigDecimal? = null,
        val modifyUserName: String? = null,
        val modifyDt: Date? = null,
        val status: String? = null,
        val note: String? = null,
        val orgCode: String? = null,
        val orgName: String? = null,
        val parentOrgId: BigDecimal? = null,
        val address: String? = null,
        val contactPsn: String? = null,
        val telephone: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null

) : Serializable
