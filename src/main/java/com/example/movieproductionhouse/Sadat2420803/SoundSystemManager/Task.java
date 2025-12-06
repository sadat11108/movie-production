package com.example.movieproductionhouse.Sadat2420803.SoundSystemManager;

public class Task {
    private String taskName,status;
    private Double time;

    public Task(String taskName, String status, Double time) {
        this.taskName = taskName;
        this.status = status;
        this.time = time;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", status='" + status + '\'' +
                ", time=" + time +
                '}';
    }
}
