package cn.yionr.Exception;

public class StudentNotFoundException extends Exception {
    private String message;

    public StudentNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
