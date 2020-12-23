package com.yxsoft.drgsservice.service.reg.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.reg.TRegHiIcd9BaseDao
import com.yxsoft.drgsservice.entity.reg.TRegHiIcd9Base
import com.yxsoft.drgsservice.service.reg.TRegHiIcd9BaseService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TRegHiIcd9BaseServiceImpl : ServiceImpl<TRegHiIcd9BaseDao, TRegHiIcd9Base>(), TRegHiIcd9BaseService{

}
