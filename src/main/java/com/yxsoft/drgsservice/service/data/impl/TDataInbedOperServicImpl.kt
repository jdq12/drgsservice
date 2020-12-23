package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataInbedOperDao
import com.yxsoft.drgsservice.entity.data.TDataInbedOper
import com.yxsoft.drgsservice.service.data.TDataInbedOperService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Transactional
@Service
class TDataInbedOperServicImpl : ServiceImpl<TDataInbedOperDao, TDataInbedOper>(), TDataInbedOperService {
}
