package com.yxsoft.drgsservice.controller.check;

import com.yxsoft.drgsservice.controller.sys.BaseController;
import com.yxsoft.drgsservice.system.GlobalManager;
import com.yxsoft.drgsservice.system.Result;
import com.yxsoft.drgsservice.system.myMap;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/*
JDQ 返回医保机构  就诊科室   drg编码
 */
@Slf4j
@RestController
@RequestMapping( "${URL.CHECK}/option")
public class baseOptionController extends BaseController {
    @RequestMapping("/allOrgs")
    @ApiOperation(value = "取所有机构的code和name")
    public Result allOrgs(@RequestBody myMap<String, Object> queryMap){
     //log.info("aaaa");
        queryMap
       return GlobalManager.sysOrgService.getOrgInfo(queryMap.toPage()).toSuccess();
    }
}
