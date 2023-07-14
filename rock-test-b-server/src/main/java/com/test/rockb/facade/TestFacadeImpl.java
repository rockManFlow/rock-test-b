package com.test.rockb.facade;

import com.rock.rpc.annotation.RpcService;
import com.test.rockb.request.TestRequest;
import com.test.rockb.response.TestResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RpcService
public class TestFacadeImpl implements TestFacade{
    @Override
    public TestResponse create(TestRequest request) {
        log.info("TestFacadeImpl create request:{}",request);

        TestResponse response=new TestResponse();
        response.setCode(10);
        response.setMsg("Success");
        return response;
    }
}
