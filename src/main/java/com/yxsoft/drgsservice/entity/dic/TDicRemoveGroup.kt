package com.yxsoft.drgsservice.entity.dic

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.util.*

data class TDicRemoveGroup(
        @TableId(type = IdType.AUTO)
        val removeGroupId: Long? = null,
        val paramName: String? = null,
        val note: String? = null,
        val status: String? = null,
        val modifyUserId: Long? = null,
        val modifyUserName: String? = null,
        val modifyDt: Date? = null,
        @TableLogic
        @JsonIgnore
        val deleted: Int? = null


) : Serializable
