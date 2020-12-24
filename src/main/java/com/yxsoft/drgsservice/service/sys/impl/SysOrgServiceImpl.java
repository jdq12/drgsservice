package com.yxsoft.drgsservice.service.sys.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxsoft.drgsservice.dao.sys.SysOrgDao;
import com.yxsoft.drgsservice.entity.sys.TSysOrg;
import com.yxsoft.drgsservice.service.sys.SysOrgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Slf4j
@Transactional
@Service
public class SysOrgServiceImpl extends ServiceImpl<SysOrgDao, TSysOrg> implements SysOrgService {
    @Autowired
    SysOrgDao sysorgdao;
    @Override
    public IPage<TSysOrg> getOrgInfo(IPage<TSysOrg> page) {
        log.info("输出结果");
            return sysorgdao.getOrgsInfo(page);
    }
}
