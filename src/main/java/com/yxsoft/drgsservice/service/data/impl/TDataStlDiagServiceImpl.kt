package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataStlDiagDao
import com.yxsoft.drgsservice.entity.data.TDataStlDiag
import com.yxsoft.drgsservice.service.data.TDataStlDiagService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDataStlDiagServiceImpl : ServiceImpl<TDataStlDiagDao, TDataStlDiag>(), TDataStlDiagService {

}
