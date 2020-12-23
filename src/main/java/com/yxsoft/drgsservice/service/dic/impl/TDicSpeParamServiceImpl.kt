package com.yxsoft.drgsservice.service.dic.impl


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.dic.DicSpeParamDao
import com.yxsoft.drgsservice.entity.dic.TDicSpeParam
import com.yxsoft.drgsservice.service.dic.TDicSpeParamService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class TDicSpeParamServiceImpl : ServiceImpl<DicSpeParamDao, TDicSpeParam>(), TDicSpeParamService {

}
