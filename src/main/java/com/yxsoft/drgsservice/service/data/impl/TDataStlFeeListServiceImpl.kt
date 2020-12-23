package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataStlFeeListDao
import com.yxsoft.drgsservice.entity.data.TDataStlFeeList
import com.yxsoft.drgsservice.service.data.TDataStlFeeListService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDataStlFeeListServiceImpl : ServiceImpl<TDataStlFeeListDao, TDataStlFeeList>(), TDataStlFeeListService {

}
