package com.yxsoft.drgsservice.service.data.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.data.TDataStlOperDao
import com.yxsoft.drgsservice.entity.data.TDataStlOper
import com.yxsoft.drgsservice.service.data.TDataStlOperService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDataStlOperServiceImpl : ServiceImpl<TDataStlOperDao, TDataStlOper>(), TDataStlOperService {

}