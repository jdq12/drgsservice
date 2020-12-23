package com.yxsoft.drgsservice.service.dic.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.dic.DicDrgDao
import com.yxsoft.drgsservice.entity.dic.TDicDrg
import com.yxsoft.drgsservice.service.dic.DicDrgService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class DicDrgServiceImpl : ServiceImpl<DicDrgDao, TDicDrg>(), DicDrgService {


}