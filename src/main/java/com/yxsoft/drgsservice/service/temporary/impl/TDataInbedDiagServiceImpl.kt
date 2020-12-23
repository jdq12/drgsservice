package com.yxsoft.drgsservice.service.temporary.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.temporary.DataInbedDiagDao
import com.yxsoft.drgsservice.entity.temporary.DataInbedDiag
import com.yxsoft.drgsservice.service.temporary.TDataInbedDiagService
import org.springframework.stereotype.Service

@Service("DataInbedDiagServiceImpl")
class TDataInbedDiagServiceImpl :ServiceImpl<DataInbedDiagDao,DataInbedDiag>(),  TDataInbedDiagService {

}
