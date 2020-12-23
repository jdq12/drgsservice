package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataInbedIcuListDao
import com.yxsoft.drgsservice.entity.data.TDataInbedIcuList
import com.yxsoft.drgsservice.service.data.TDataInbedIcuListService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDataInbedIcuListServiceImpl : ServiceImpl<TDataInbedIcuListDao, TDataInbedIcuList>(), TDataInbedIcuListService {
//    override fun checkIcuList(icuList: TDataInbedIcuList) {
//        ("业务逻辑异常方法")
//    }

}
