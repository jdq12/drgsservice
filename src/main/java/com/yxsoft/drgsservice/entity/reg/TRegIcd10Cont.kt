package com.yxsoft.drgsservice.entity.reg

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import io.swagger.annotations.ApiModel
import java.util.*

@ApiModel(value = "ICD10对码表")
@TableName(schema = "DRGS_BASE", value = "T_REG_ICD_10_CONT")
data class TRegIcd10Cont(
        @TableId(value = "CONT_ID", type = IdType.INPUT)
        var contId: Long? = null,
        @TableField("SI_ICD_10_CODE")
        var siIcd10Code: String? = null,
        @TableField("SI_ICD_10_NAME")
        var siIcd10Name: String? = null,
        @TableField("HI_ICD_10_CODE")
        var hiIcd10Code: String? = null,
        @TableField("HI_ICD_10_NAME")
        var hiIcd10Name: String? = null,
        var contType: String? = null,
        var note: String? = null,
        var status: String? = null,
        var modifyUserId: Long? = null,
        var modifyUserName: String? = null,
        var modifyDt: Date? = null

)
