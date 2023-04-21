package com.java.designpatterns.prototype;

public class Employee implements Cloneable{
    private int id;
    private String name;
    private Work work;

    public Employee() {}
    
    public Employee(Employee emp){
        this.id = emp.id;
        this.name = emp.name;
        this.work = new Work();
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

    public Work getWork() {
        return work;
    }
    public void setWork(Work work) {
        this.work = work;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException{
        Employee emp = (Employee) super.clone();
        emp.work = new Work();
        return emp;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", work=" + work + "]";
    }
}
