package de.rinderle.dhbw.wwi23b3.patterns.builder;

public class LoggingData {

    private String className;
    private String methodName;
    private String reason;
    private String message;
    private Exception exception;
    private int performanceMillis;
    private String loggingMessage;

    public LoggingData(String className, String methodName, String reason, String message) {
        this.className = className;
        this.methodName = methodName;
        this.reason = reason;
        this.message = message;

        this.loggingMessage = this.className + "." + this.methodName + "(" + this.reason + "):" + message;
    }

    public LoggingData(String className, String methodName, Exception exception) {
        this.className = className;
        this.methodName = methodName;
        this.exception = exception;

        this.loggingMessage = this.className + "." + this.methodName + " " + exception.getMessage();
    }

    public LoggingData(String className, String methodName, int performanceMillis) {
        this.className = className;
        this.methodName = methodName;
        this.performanceMillis = performanceMillis;

        this.loggingMessage = this.className + "." + this.methodName + " performance " + performanceMillis;
    }
}
