package com.test.rockb.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TestRequest implements Serializable {
    private String name;
    private Integer age;
    private Date date;
}
