package model;

import java.util.List;

public class Quiz {
    private String description;
    private int duration;
    private List<Question> questions;
    private String title;

    public Quiz(String description, int duration, List<Question> questions, String title) {
        this.description = description;
        this.duration = duration;
        this.questions = questions;
        this.title = title;
    }

    public String getDescription() {return description;}
    public int getDuration() {return duration;}
    public List<Question> getQuestions() {return questions;}
    public String getTitle() {return title;}

    public void setDescription(String description) {this.description = description;}
    public void setDuration(int duration) {this.duration = duration;}
    public void setQuestions(List<Question> questions) {this.questions = questions;}
    public void setTitle(String title) {this.title = title;}
    public void addQuestions(Question question) {questions.add(question);}
    public void deleteQuestions(int index) {questions.remove(index);}
}
