package bai_tap_them_OOP.bai_1;

public class Candidate {
    private int id;
    private String name;
    private String dateOfBirth;
    private double scoreMath;
    private double scoreWriting;
    private double scoreEnglish;

    public Candidate() {
    }

    public Candidate(int id, String name, String dateOfBirth,
                     double scoreMath, double scoreWriting, double scoreEnglish) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.scoreMath = scoreMath;
        this.scoreWriting = scoreWriting;
        this.scoreEnglish = scoreEnglish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScoreWriting() {
        return scoreWriting;
    }

    public void setScoreWriting(double scoreWriting) {
        this.scoreWriting = scoreWriting;
    }

    public double getScoreEnglish() {
        return scoreEnglish;
    }

    public void setScoreEnglish(double scoreEnglish) {
        this.scoreEnglish = scoreEnglish;
    }


}
