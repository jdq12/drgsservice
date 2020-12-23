package com.yxsoft.drgsservice.entity.reg

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import io.swagger.annotations.ApiModel
import java.io.Serializable
import java.util.*

@ApiModel(value = "ICD10临床版")
@TableName(schema = "DRGS_BASE", value = "T_REG_HI_ICD_10_BASE")
data class TRegHiIcd10Base(
        @TableId(value = "SI_ICD_BASE_ID", type = IdType.INPUT)
        var siIcdBaseId: Long? = null,
        @TableField("ICD_10_CODE")
        var icd10Code: String? = null,
        @TableField("ICD_10_NAME")
        var icd10Name: String? = null,
        var note: String? = null,
        var status: String? = null,
        var modifyUserId: Long? = null,
        var modifyUserName: String? = null,
        var modifyDt: Date? = null,

        ) : Serializable
