package ru.job4j.pojo;

public class Student {
    private String fullName;
    private int group;
    private String date;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

class College {
    public static void main(String[] args) {
        Student s = new Student ();
        s.setFullName ("Bublik Ivanovich Lesnoy");
        s.setGroup (3000);
        s.setDate("30 августа");
        System.out.println("Новый студент лесной школы: " + s.getFullName() + ", N группы: " + s.getGroup() + ", дата зачисления: " + s.getDate() );
    }
}