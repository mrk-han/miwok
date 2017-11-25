package com.example.android.miwok;

/**
 * Created by markhan on 11/15/17.
 */

public class ReportCard {

    private int englishGrade;
    private int mathGrade;
    private int historyGrade;
    private int artGrade;
    private int musicGrade;

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    public int getArtGrade() {
        return artGrade;
    }

    public void setArtGrade(int artGrade) {
        this.artGrade = artGrade;
    }

    public int getMusicGrade() {
        return musicGrade;
    }

    public void setMusicGrade(int musicGrade) {
        this.musicGrade = musicGrade;
    }

    public ReportCard(int englishGrade, int mathGrade, int historyGrade, int artGrade, int musicGrade) {
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.artGrade = artGrade;
        this.musicGrade = musicGrade;
    }

    @Override
    public String toString() {
        return "Name: John Doe; English grade: " + getEnglishGrade() + "; History grade: " + getHistoryGrade() + "; Math grade: " + getMathGrade() + "; Art grade: " + getArtGrade() + "; Music grade: " + getMusicGrade()+ ";";
    }



}
