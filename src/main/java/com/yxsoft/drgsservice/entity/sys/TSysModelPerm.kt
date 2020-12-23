package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable

data class TSysModelPerm(
        val permCode: String? = null,
        val modelCode: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null

) : Serializable
