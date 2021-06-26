package com.SpringCore.SetterInjection;

public class Student {
    private int studId;
    private String studName;
    private String studAddress;
    private Scores scores;

    public int getStudId() {
        return studId;
    }
    public void setStudId(int studId) {
        this.studId = studId;
    }

    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    public String getStudName() {
        return studName;
    }
    public void setStudName(String studName) {
        this.studName = studName;
    }
    public String getStudAddress() {
        return studAddress;
    }
    public void setStudAddress(String studAddress) {
        this.studAddress = studAddress;
    }

    public Student(int studId, String studName, String studAddress) {
        super();
        this.studId = studId;
        this.studName = studName;
        this.studAddress = studAddress;
    }

    @Override
    public String toString() {
        return "StudentDetails [studId = " + studId + ", studName = " + studName + ", studAddress = " + studAddress + " " +  scores +"]";
    }
    public Student() {
        super();
    }
}
