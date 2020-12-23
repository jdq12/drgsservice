package com.yxsoft.drgsservice.service.temporary.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.temporary.CheckInbedDrgsDao
import com.yxsoft.drgsservice.entity.temporary.CheckInbedDrgs
import com.yxsoft.drgsservice.service.temporary.TCheckInbedDrgsService
import org.springframework.stereotype.Service

@Service("CheckInbedDrgsServiceImpl")
class TCheckInbedDrgsServiceImpl : ServiceImpl<CheckInbedDrgsDao, CheckInbedDrgs>(), TCheckInbedDrgsService {

}
