package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataInbedOperListDao
import com.yxsoft.drgsservice.entity.data.TDataInbedOperList
import com.yxsoft.drgsservice.service.data.TDataInbedOperListService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDataInbedOperListServiceImpl : ServiceImpl<TDataInbedOperListDao, TDataInbedOperList>(), TDataInbedOperListService {

}
