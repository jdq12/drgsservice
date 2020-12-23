package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataInbedDiagDao
import com.yxsoft.drgsservice.entity.data.TDataInbedDiag
import com.yxsoft.drgsservice.service.data.TDataInbedDiagService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDataInbedDiagServiceImpl : ServiceImpl<TDataInbedDiagDao, TDataInbedDiag>(), TDataInbedDiagService {

}
