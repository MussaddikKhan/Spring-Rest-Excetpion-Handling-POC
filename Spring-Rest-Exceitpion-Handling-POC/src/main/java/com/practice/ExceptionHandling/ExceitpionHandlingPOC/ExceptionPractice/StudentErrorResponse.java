package com.practice.ExceptionHandling.ExceitpionHandlingPOC.ExceptionPractice;

public class StudentErrorResponse {
    private int status; // 404, 501
    private String message; //Custom Exception occurs message

    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public StudentErrorResponse() {
    }

    private long timeStamp;  // Creation time stamp

    @Override
    public String toString() {
        return "StudentErrorResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
