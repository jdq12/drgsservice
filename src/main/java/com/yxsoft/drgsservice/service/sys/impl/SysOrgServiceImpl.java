package com.yxsoft.drgsservice.service.sys.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yxsoft.drgsservice.dao.sys.SysOrgDao;
import com.yxsoft.drgsservice.entity.sys.TSysOrg;
import com.yxsoft.drgsservice.service.sys.SysOrgService;

public class SysOrgServiceImpl extends ServiceImpl<SysOrgDao, TSysOrg> implements SysOrgService {
    @Override
    public IPage<TSysOrg> getOrgInfo(IPage<TSysOrg> page) {
        return null;
    }
}
