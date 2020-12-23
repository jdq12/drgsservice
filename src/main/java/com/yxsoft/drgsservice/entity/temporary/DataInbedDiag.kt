package com.yxsoft.drgsservice.entity.temporary

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import java.math.BigDecimal

@TableName(value = "DRGS_CHECK.T_DATA_INBED_DIAG")
data class DataInbedDiag(
        @TableId(value = "INBED_DIAG_ID", type = IdType.INPUT)
        var inbedDiagId: Long? = null,
        var inbedMedId: Long? = null,
        var diagType: String? = null,
        var diagWay: String? = null,
        var diagCode: String? = null,
        var diagName: String? = null,
        var inbedDiagType: String? = null,
        var inbedDiagNote: String? = null,
        var deleted: BigDecimal? = null,
        var hiDiagCode: String? = null,
        var hiDiagName: String? = null

) : Serializable
