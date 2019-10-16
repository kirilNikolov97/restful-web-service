package com.kirilnikolov97.restfulwebservice.todo;

import java.util.Date;

public class Todo {
    private long id;
    private String description;
    private Date targetDate;
    private boolean isAchieved;

    public Todo(long id, String description, Date targetDate, boolean isAchieved) {
        this.id = id;
        this.description = description;
        this.targetDate = targetDate;
        this.isAchieved = isAchieved;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean getIsAchieved() {
        return isAchieved;
    }

    public void setIsAchieved(boolean achieved) {
        isAchieved = achieved;
    }
}
