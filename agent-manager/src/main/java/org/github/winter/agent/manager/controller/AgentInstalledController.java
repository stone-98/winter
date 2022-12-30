package org.github.winter.agent.manager.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.github.winter.agent.manager.model.AgentInstalled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AgentInstalledController {
    @ApiOperation(value = "查询Agent安装信息", notes = "根据ID查询Agent安装信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", value = "主键", dataType = "Integer", example = "1")
    })
    @GetMapping("/agentInstalled/{id}")
    public AgentInstalled get(@PathVariable("id") Integer id) {
        AgentInstalled agentInstalled = new AgentInstalled();
        agentInstalled.setId(1);
        agentInstalled.setAddress("http://192.169.0.1");
        log.info("Get agentInstalled [{}] by id[{}].",agentInstalled, id);
        return agentInstalled;
    }
}
