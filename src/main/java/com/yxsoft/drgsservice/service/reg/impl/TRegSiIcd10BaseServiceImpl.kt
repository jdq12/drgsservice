package com.yxsoft.drgsservice.service.reg.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.reg.TRegIcd10ContDao
import com.yxsoft.drgsservice.dao.reg.TRegSiIcd10BaseDao
import com.yxsoft.drgsservice.entity.reg.TRegIcd10Cont
import com.yxsoft.drgsservice.entity.reg.TRegSiIcd10Base
import com.yxsoft.drgsservice.service.reg.TRegIcd10ContService
import com.yxsoft.drgsservice.service.reg.TRegSiIcd10BaseService
import org.springframework.stereotype.Service

@Service
class TRegSiIcd10BaseServiceImpl : ServiceImpl<TRegSiIcd10BaseDao, TRegSiIcd10Base>(), TRegSiIcd10BaseService {

}
