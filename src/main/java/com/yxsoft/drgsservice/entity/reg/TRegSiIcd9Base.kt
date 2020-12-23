package com.yxsoft.drgsservice.entity.reg

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import io.swagger.annotations.ApiModel
import java.io.Serializable
import java.util.*

@ApiModel(value = "ICD9医保版")
@TableName(schema = "DRGS_BASE", value = "T_REG_SI_ICD_9_BASE")
data class TRegSiIcd9Base(
        @TableId(value = "SI_ICD_BASE_ID", type = IdType.INPUT)
        var siIcdBaseId: Long? = null,
        @TableField("ICD_9_CODE")
        var icd9Code: String? = null,
        @TableField("ICD_9_NAME")
        var icd9Name: String? = null,
        var note: String? = null,
        var status: String? = null,
        var modifyUserId: Long? = null,
        var modifyUserName: String? = null,
        var modifyDt: Date? = null
) : Serializable
