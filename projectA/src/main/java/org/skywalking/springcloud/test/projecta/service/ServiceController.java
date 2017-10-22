package org.skywalking.springcloud.test.projecta.service;

import org.skywalking.springcloud.test.projecta.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {


    @Autowired
    private RibbonCallService projectBServiceCall;

    @Autowired
    private FeignCallService projectCServiceCall;

    @RequestMapping(value = "/projectA/{name}")
    @ResponseBody
    public Result hi(@PathVariable(required = false) String name) {
        String projectBResult = projectBServiceCall.call(name);
        String projectCResult = projectCServiceCall.call(name);

        return new Result(projectBResult, projectCResult);
    }

}
