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
    private String studentName;

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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ReportCard(String studentName, int englishGrade, int mathGrade, int historyGrade, int artGrade, int musicGrade) {
        this.studentName = studentName;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.artGrade = artGrade;
        this.musicGrade = musicGrade;
    }

    //The most important portion of your project will be the toString() method, which gives
    //a human-readable String representing the data stored in the report card
    @Override
    public String toString() {
        return "Name: " + getStudentName() + "\n" + "English grade: " + getEnglishGrade() + "\n" + "Math grade: " +
                getMathGrade() + "\n" + "Music grade: " + getMusicGrade() + "\n" + "History grade: " + getHistoryGrade() + "\n" + "Art grade: " + getArtGrade();
    }

    public static void main(String[] args) {
        ReportCard markReportCard = new ReportCard("Mark", 1, 2, 3, 4, 5);
        System.out.println(markReportCard.toString());
    }


}
