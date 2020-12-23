package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataInbedOutbedSummDao
import com.yxsoft.drgsservice.entity.data.TDataInbedOutbedSumm
import com.yxsoft.drgsservice.service.data.TDataInbedOutbedSummService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDataInbedOutbedSummServiceImpl : ServiceImpl<TDataInbedOutbedSummDao, TDataInbedOutbedSumm>(), TDataInbedOutbedSummService {

}
