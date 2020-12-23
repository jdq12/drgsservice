package com.yxsoft.drgsservice.service.reg.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.reg.TRegHiIcd10BaseDao
import com.yxsoft.drgsservice.entity.reg.TRegHiIcd10Base
import com.yxsoft.drgsservice.service.reg.TRegHiIcd10BaseService
import org.springframework.stereotype.Service

@Service
class TRegHiIcd10BaseServiceImpl : ServiceImpl<TRegHiIcd10BaseDao, TRegHiIcd10Base>(),TRegHiIcd10BaseService{

}
