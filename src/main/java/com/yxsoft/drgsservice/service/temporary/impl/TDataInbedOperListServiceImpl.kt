package com.yxsoft.drgsservice.service.temporary.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.temporary.DataInbedOperListDao
import com.yxsoft.drgsservice.entity.temporary.DataInbedOperList
import com.yxsoft.drgsservice.service.temporary.TDataInbedOperListService
import org.springframework.stereotype.Service

@Service("DataInbedOperListServiceImpl")
class TDataInbedOperListServiceImpl : ServiceImpl<DataInbedOperListDao,DataInbedOperList>(), TDataInbedOperListService {

}
