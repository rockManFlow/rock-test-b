package com.test.rocka.controller;

import com.rock.rpc.annotation.RpcReference;
import com.test.rockb.facade.TestFacade;
import com.test.rockb.request.TestRequest;
import com.test.rockb.response.TestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RequestMapping("test/a")
@RestController
public class TestAController {
    @RpcReference
    private TestFacade testFacade;
    @RequestMapping(value = "create",method = RequestMethod.GET)
    public String create(String name,Integer age){
        log.info("TestAController create");

        TestRequest request=new TestRequest();
        request.setAge(age);
        request.setDate(new Date());
        request.setName(name);
        log.info("TestAController create request:{}",request);
        TestResponse response = testFacade.create(request);
        log.info("TestAController create response:{}",response);
        return response.toString();
    }
}
