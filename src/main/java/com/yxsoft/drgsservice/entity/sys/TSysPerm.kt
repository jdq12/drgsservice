package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore

data class TSysPerm(
        val permCode: String? = null,
        val permName: String? = null,
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null

)
