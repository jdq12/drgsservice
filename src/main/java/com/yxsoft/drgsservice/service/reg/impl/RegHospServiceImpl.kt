package com.yxsoft.drgsservice.service.reg.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.reg.RegHospDao
import com.yxsoft.drgsservice.entity.reg.TRegHosp
import com.yxsoft.drgsservice.service.reg.RegHospService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class RegHospServiceImpl : ServiceImpl<RegHospDao, TRegHosp>(), RegHospService {

}
