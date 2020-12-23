package com.yxsoft.drgsservice.service.sys;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yxsoft.drgsservice.entity.sys.TSysOrg;

public interface SysOrgService extends IService<TSysOrg> {
     IPage<TSysOrg> getOrgInfo(IPage<TSysOrg> page);
}
