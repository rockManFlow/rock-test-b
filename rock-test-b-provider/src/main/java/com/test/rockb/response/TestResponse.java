package com.test.rockb.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestResponse implements Serializable {
    private String msg;
    private Integer code;
}
