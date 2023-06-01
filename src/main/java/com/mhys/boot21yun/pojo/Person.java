package com.mhys.boot21yun.pojo;

import com.mhys.boot21yun.Boot21yunApplication;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName;  //姓
    private Integer age; //年龄
    private Boolean boss;
    private Map<String,Object> maps;
    private java.util.List<Object> list;
    private Dog dog;

}
