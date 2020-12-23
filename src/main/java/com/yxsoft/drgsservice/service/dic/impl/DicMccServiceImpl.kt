package com.yxsoft.drgsservice.service.dic.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.dic.DicMccDao
import com.yxsoft.drgsservice.entity.dic.TDicMcc
import com.yxsoft.drgsservice.service.dic.DicMccService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class DicMccServiceImpl : ServiceImpl<DicMccDao, TDicMcc>(), DicMccService {

}
