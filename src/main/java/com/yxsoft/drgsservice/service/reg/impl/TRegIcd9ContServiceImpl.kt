package com.yxsoft.drgsservice.service.reg.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.reg.TRegIcd9ContDao
import com.yxsoft.drgsservice.entity.reg.TRegIcd9Cont
import com.yxsoft.drgsservice.service.reg.TRegIcd9ContService
import org.springframework.stereotype.Service

@Service
class TRegIcd9ContServiceImpl : ServiceImpl<TRegIcd9ContDao, TRegIcd9Cont>(), TRegIcd9ContService {

}
