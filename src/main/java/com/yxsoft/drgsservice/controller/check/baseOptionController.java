package com.yxsoft.drgsservice.controller.check;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yxsoft.drgsservice.controller.sys.BaseController;
import com.yxsoft.drgsservice.entity.dic.TDicMdc;
import com.yxsoft.drgsservice.entity.reg.TRegDep;
import com.yxsoft.drgsservice.entity.sys.TSysOrg;
import com.yxsoft.drgsservice.service.dic.DicMdcService;
import com.yxsoft.drgsservice.service.reg.RegDepService;
import com.yxsoft.drgsservice.service.sys.SysOrgService;
import com.yxsoft.drgsservice.system.Result;
import com.yxsoft.drgsservice.system.utils.AppResponse;
import com.yxsoft.drgsservice.system.utils.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/*
JDQ 返回医保机构  就诊科室   drg编码
 */
@Slf4j
@RestController
@RequestMapping( "${URL.CHECK}/option")
@Api(tags ={"医保机构,就诊科室,drg编码"})
public class baseOptionController extends BaseController {
    @Autowired
    SysOrgService sysOrgService;
    @Autowired
    PageResult<TSysOrg> pageOrg;
    @Autowired
    AppResponse appResponse;
    @Autowired
    RegDepService regDepService;
    @Autowired
    PageResult<TRegDep> pageDep;
    @Autowired
    DicMdcService dicMdcService;
    @Autowired
    PageResult<TDicMdc> pageMed;
    @PostMapping("/allOrgs")
    @ApiOperation(value = "取所有机构的code和name和ID")
    public AppResponse<IPage<TSysOrg>> allOrgs(@RequestBody Map<String, Object> queryMap)

    {
        log.info("aaaa");
          IPage<TSysOrg> orgInfo = sysOrgService.getOrgInfo(pageOrg.toPage(queryMap));
        return appResponse.ok(orgInfo);
    }
    @PostMapping("/alldeps")
    @ApiOperation(value = "取所有科室的code和name和ID")
    public AppResponse<IPage<TRegDep>> allDeps(@RequestBody Map<String, Object> queryMap ){
        IPage<TRegDep> orgInfo = regDepService.getDepsInfo(pageDep.toPage(queryMap));
        return appResponse.ok(orgInfo);
    }
    @PostMapping("/allDrg")
    @ApiOperation(value = "主诊断的code,name(drg编码)")
    public AppResponse<IPage<TDicMdc>> allDrg(@RequestBody Map<String, Object> queryMap){
        IPage<TDicMdc> medInfo = dicMdcService.getDrgInfo(pageMed.toPage(queryMap));
        return appResponse.ok(medInfo);
    }

}
