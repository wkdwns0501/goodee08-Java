package sec12.exam02;

public class Student{
    
    private String name;
    private String gender;
    private int score;
    
    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
    
    public String getName() {
        return name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
