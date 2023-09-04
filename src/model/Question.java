package model;

import java.util.List;

public class Question {
    private String ask;
    private List<String> choices;
    private List<Double> answers;
    private int level;

    public String getAsk() {return ask;}
    public List<String> getChoices() {return choices;}
    public List<Double> getAnswers() {return answers;}
    public int getLevel() {return level;}

    public void setAsk(String ask) {this.ask = ask;}
    public void setChoices(List<String> choices) {this.choices = choices;}
    public void setAnswers(List<Double> answers) {this.answers = answers;}
    public void setLevel(int level) {this.level = level;}

    public void addChoice(String choice) {choices.add(choice);}
    public void deleteChoice(int index) {choices.remove(index);}
    public void addAnswer(Double answer) {answers.add(answer);}
    public void deleteAnswer(int index) {answers.remove(index);}
}
