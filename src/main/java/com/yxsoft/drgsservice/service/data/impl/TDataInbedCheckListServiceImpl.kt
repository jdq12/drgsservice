package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataInbedCheckListDao
import com.yxsoft.drgsservice.entity.data.TDataInbedCheckList
import com.yxsoft.drgsservice.service.data.TDataInbedCheckListService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDataInbedCheckListServiceImpl : ServiceImpl<TDataInbedCheckListDao, TDataInbedCheckList>(), TDataInbedCheckListService {

}
