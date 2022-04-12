package com.fobgochod.lesson.lesson13;

public class User {

    private String username;
    private Student student;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", student=" + student +
                '}';
    }
}
