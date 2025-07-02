package stream2;

public class Course {
    private String title;
    private int grade;

    public Course (String title, int grade){
        this.title = title;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", grade=" + grade +
                '}';
    }
}
