package com.yxsoft.drgsservice.service.dic.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.yxsoft.drgsservice.dao.dic.DicRemoveListDao
import com.yxsoft.drgsservice.entity.dic.TDicRemoveList
import com.yxsoft.drgsservice.service.dic.DicRemoveListService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class DicRemoveListServiceImpl : ServiceImpl<DicRemoveListDao, TDicRemoveList>(), DicRemoveListService {


}
