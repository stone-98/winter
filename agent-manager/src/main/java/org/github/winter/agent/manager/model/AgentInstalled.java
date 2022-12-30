package org.github.winter.agent.manager.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@ApiModel("Agent安装信息")
public class AgentInstalled {
    @ApiModelProperty(name = "主键", example = "1")
    private Integer id;
    @ApiModelProperty(name = "安装地址信息", example = "http://192.168.0.1")
    private String address;
}
