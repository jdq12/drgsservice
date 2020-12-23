package com.yxsoft.drgsservice.service.reg.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.reg.TRegIcd10ContDao
import com.yxsoft.drgsservice.entity.reg.TRegIcd10Cont
import com.yxsoft.drgsservice.service.reg.TRegIcd10ContService
import org.springframework.stereotype.Service

@Service
class TRegIcd10ContServiceImpl : ServiceImpl<TRegIcd10ContDao, TRegIcd10Cont>(), TRegIcd10ContService {

}
