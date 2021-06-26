package com.SpringCore.SetterInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CompleteInjectionDependencies {
    private int personId;
    private String personName;
    private List<String> personBankAccounts;
    private Set<Integer> accountNumbers;
    private Map<String,String> householdProducts;
    private Properties companiesWorked;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List<String> getPersonBankAccounts() {
        return personBankAccounts;
    }

    public void setPersonBankAccounts(List<String> personBankAccounts) {
        this.personBankAccounts = personBankAccounts;
    }

    public Set<Integer> getAccountNumbers() {
        return accountNumbers;
    }

    public void setAccountNumbers(Set<Integer> accountNumbers) {
        this.accountNumbers = accountNumbers;
    }

    public Map<String, String> getHouseholdProducts() {
        return householdProducts;
    }

    public void setHouseholdProducts(Map<String, String> householdProducts) {
        this.householdProducts = householdProducts;
    }

    public Properties getCompaniesWorked() {
        return companiesWorked;
    }

    public void setCompaniesWorked(Properties companiesWorked) {
        this.companiesWorked = companiesWorked;
    }
}
