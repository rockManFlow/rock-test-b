package com.test.rockb.facade;

import com.test.rockb.request.TestRequest;
import com.test.rockb.response.TestResponse;

public interface TestFacade {
    public TestResponse create(TestRequest request);
}
