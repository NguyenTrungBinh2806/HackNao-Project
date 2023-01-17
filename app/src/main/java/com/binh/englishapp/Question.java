package com.binh.englishapp;

public class Question {
    public String answer;
    public String answera;
    public String answerb;
    public String unit;
    public String answerc;
    public String question;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswera() {
        return answera;
    }

    public void setAnswera(String answera) {
        this.answera = answera;
    }

    public String getAnswerb() {
        return answerb;
    }

    public void setAnswerb(String answerb) {
        this.answerb = answerb;
    }

    public String getAnswerc() {
        return answerc;
    }

    public void setAnswerc(String answerc) {
        this.answerc = answerc;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Question(String answer, String answera, String answerb, String answerc, String question, String unit) {
        this.answer = answer;
        this.answera = answera;
        this.answerb = answerb;
        this.answerc = answerc;
        this.question = question;
        this.unit = unit;
    }
    public Question(){

    }
}

