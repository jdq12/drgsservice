package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataInbedFeeListDao
import com.yxsoft.drgsservice.entity.data.TDataInbedFeeList
import com.yxsoft.drgsservice.service.data.TDataInbedFeeListService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDataInbedFeeListServiceImpl : ServiceImpl<TDataInbedFeeListDao, TDataInbedFeeList>(), TDataInbedFeeListService {

}