package com.yxsoft.drgsservice.entity.temporary

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

@TableName(value = "DRGS_CHECK.T_DATA_INBED_OPER_LIST")
data class DataInbedOperList(
        @TableId(value = "INBED_OPER_LIST_ID", type = IdType.INPUT)
        var inbedOperListId: Long? = null,
        var inbedOperId: Long? = null,
        var operNo: String? = null,
        var operCode: String? = null,
        var operName: String? = null,
        var operLevel: String? = null,
        var operInciType: String? = null,
        var operHealLevel: String? = null,
        var operMainIden: String? = null,
        @TableField(value = "IS_TATR")
        val tatr: String? = null,
        var inbedMedId: Long? = null,
        var deleted: BigDecimal? = null,
        var hiOperCode: String? = null,
        var hiOperName: String? = null

) : Serializable
