package com.java.designpatterns.creationalpattern.prototype;

public class Course implements Cloneable{
    private int id;
    private String name;
    private double duration;
    private Review review;

    public Course() {}
    
    public Course(Course course){
        this.id = course.id;
        this.name = course.name;
        this.duration = course.duration;
        this.review = new Review();
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

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    @Override
    public Course clone() throws CloneNotSupportedException{
        Course course = (Course) super.clone();
        this.review = new Review();
        return course;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", duration=" + duration + ", review=" + review + "]";
    }    

}
