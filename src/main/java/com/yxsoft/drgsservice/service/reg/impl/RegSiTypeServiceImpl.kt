package com.yxsoft.drgsservice.service.reg.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.reg.RegSiTypeDao
import com.yxsoft.drgsservice.entity.reg.TRegSiType
import com.yxsoft.drgsservice.service.reg.RegSiTypeService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class RegSiTypeServiceImpl : ServiceImpl<RegSiTypeDao, TRegSiType>(), RegSiTypeService {

}
