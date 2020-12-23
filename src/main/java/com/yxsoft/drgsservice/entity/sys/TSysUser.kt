package com.yxsoft.drgsservice.entity.sys

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.KeySequence
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableLogic
import com.fasterxml.jackson.annotation.JsonIgnore
import com.yxsoft.drgsservice.controller.sys.BaseModifyInfo
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable
import java.math.BigDecimal
import java.util.*


@ApiModel(value = "用户表")
@KeySequence(value = "DRGS_BASE.SEQ_SYS_USER")
data class TSysUser(
        @TableId(type = IdType.INPUT)
        val userId: Int? = null,
        @ApiModelProperty(value = "地区ID")
        val orgId: Int? = null,
//        @ApiModelProperty(value = "修改人ID")
//        val modifyUserId: BigDecimal? = null,
//        @ApiModelProperty(value = "修改人")
//        val modifyUserName: String? = null,
//        @ApiModelProperty(value = "修改时间")
//        val modifyDt: Date? = null,
        @ApiModelProperty(value = "状态")
        val status: String? = "正常",
        @ApiModelProperty(value = "备注")
        val note: String? = null,
        @ApiModelProperty(value = "操作员编号")
        var userCode: String? = null,
        @ApiModelProperty(value = "操作员姓名")
        var userName: String? = null,
        @JsonIgnore
        @ApiModelProperty(value = "操作员密码")
        val userPwd: String? = null,
        @ApiModelProperty(value = "科室ID")
        var depId: BigDecimal? = null,
        @ApiModelProperty(value = "医院ID")
        val hospId: BigDecimal? = null,
        @JsonIgnore
        val sysAdmin: Int? = null,
        @JsonIgnore
        val hospAdmin: Int? = null,

        @Transient
        val doctorId: Int? = null,                      // 对应的 doctor_ID

        @Transient
        @JsonIgnore
        val depIds: List<Int>? = null,                // 对应的 科室Id
        @JsonIgnore
        @TableLogic
        val deleted: Int? = null
) : Serializable,BaseModifyInfo() {

    @Transient
    @JsonIgnore
    var depIdStr: String? = null

    val roleName: String
        get() {
            if (this.sysAdmin!! > 0) return "sysAdmin"
            if (this.hospAdmin!! > 0) return "hospAdmin"
            return "doctor"
        }
//    var token: String? = null

    fun enabled(): Boolean {
        return this.status.equals("正常")
    }


}
