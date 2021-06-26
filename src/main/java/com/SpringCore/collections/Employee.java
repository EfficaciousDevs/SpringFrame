package com.SpringCore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private List<String> empName;
    private Set<String> empAddress;
    private Map<String,Integer> jobSalaries;
    private Properties prop;

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public Employee(List<String> empName,Set<String> empAddress,Map<String,Integer> jobSalaries,Properties prop){
        super();
        this.empName = empName;
        this.empAddress = empAddress;
        this.jobSalaries = jobSalaries;
        this.prop = prop;
    }
    public Employee(){
        super();
    }
    public List<String> getEmpName() {
        return empName;
    }

    public void setEmpName(List<String> empName) {
        this.empName = empName;
    }

    public Set<String> getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(Set<String> empAddress) {
        this.empAddress = empAddress;
    }

    public Map<String, Integer> getJobSalaries() {
        return jobSalaries;
    }

    public void setJobSalaries(Map<String, Integer> jobSalaries) {
        this.jobSalaries = jobSalaries;
    }
}
