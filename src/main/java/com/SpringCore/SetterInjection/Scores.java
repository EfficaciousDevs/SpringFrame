package com.SpringCore.SetterInjection;

public class Scores {
    private int MathsScore;
    private int BioScore;
    private int ChemScore;
    private int PhyScore;
    private int EngScore;

    public int getMathsScore() {
        return MathsScore;
    }

    public void setMathsScore(int mathsScore) {
        MathsScore = mathsScore;
    }

    public int getBioScore() {
        return BioScore;
    }

    public void setBioScore(int bioScore) {
        BioScore = bioScore;
    }

    public int getChemScore() {
        return ChemScore;
    }

    public void setChemScore(int chemScore) {
        ChemScore = chemScore;
    }

    public int getPhyScore() {
        return PhyScore;
    }

    public void setPhyScore(int phyScore) {
        PhyScore = phyScore;
    }

    public int getEngScore() {
        return EngScore;
    }

    public void setEngScore(int engScore) {
        EngScore = engScore;
    }

    @Override
    public String toString(){
        return "Result: Biology " + getBioScore() + " English " +  getEngScore() + " Physics " + getPhyScore() + " Chemistry " + getChemScore() + " Maths " + getMathsScore();
    }
}
