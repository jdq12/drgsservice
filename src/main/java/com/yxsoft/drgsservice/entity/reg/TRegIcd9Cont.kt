package com.yxsoft.drgsservice.entity.reg

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import io.swagger.annotations.ApiModel
import java.io.Serializable
import java.util.*

@ApiModel(value = "ICD9对码表")
@TableName(schema = "DRGS_BASE", value = "T_REG_ICD_9_CONT")
data class TRegIcd9Cont(
        @TableId(value = "CONT_ID", type = IdType.INPUT)
        var contId: Long? = null,
        @TableField("SI_ICD_9_CODE")
        var siIcd9Code: String? = null,
        @TableField("SI_ICD_9_NAME")
        var siIcd9Name: String? = null,
        @TableField("HI_ICD_9_CODE")
        var hiIcd9Code: String? = null,
        @TableField("HI_ICD_9_NAME")
        var hiIcd9Name: String? = null,
        var contType: String? = null,
        var note: String? = null,
        var status: String? = null,
        var modifyUserId: Long? = null,
        var modifyUserName: String? = null,
        var modifyDt: Date? = null
) : Serializable
