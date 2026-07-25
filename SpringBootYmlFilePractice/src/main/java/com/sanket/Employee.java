package com.sanket;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
@Data
@Component("emp")
@ConfigurationProperties(prefix = "emp.details")
public class Employee {

    //Simple Properties
    private Integer eno;
    private String eName;
    private String eAddress;

    //Array Properties
    private String[] favColor;

    //Collection Properties
    private List<String> nickName;
    private Set<Long> phoneNumber;
    private Map<String, Long> IdDetails;

    //HAS-A Property
    private Project project;
}
